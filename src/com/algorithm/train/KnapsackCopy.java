package com.algorithm.train;

/**
 * 
 * 
 * 	01背包（ZeroOnePack）: 有N件物品和一个容量为c的背包。（每种物品均只有一件）第i件物品的费用是w[i]，价值是v[i]。求解将哪些物品装入背包可使价值总和最大。

for i=1..N
   forv=V..0
        f[v]=max{f[v],f[v-c[i]]+w[i]};
	完全背包(CompletePack): 有N种物品和一个容量为c的背包，每种物品都有无限件可用。第i种物品的费用是w[i]，价值是v[i]。求解将哪些物品装入背包可使这些物品的费用总和不超过背包容量，且价值总和最大。

	多重背包(MultiplePack): 有N种物品和一个容量为c的背包。第i种物品最多有n[i]件可用，每件费用是w[i]，价值是v[i]。求解将哪些物品装入背包可使这些物品的费用总和不超过背包容量，且价值总和最大。
 * 
 * 
 * 
 * 
 * 0-1背包问题
 * 
 * 现有n件物品和一个容量为c的背包。第i件物品的重量是重量为w[i]，价值是v[i]。
 * 已知对于一件物品必须选择取（用1表示）或者不取（用0表示），且每件物品只能被取一次（这就是“0-1”的含义）。
 * 求放置哪些物品进背包，可使这些物品的重量总和不超过背包容量，且价值总和最大。
 * 
 * 假设有5件物品，其重量分别是w={2，2，6，5，4}，价值分别是v={6，3，5，4，6}，背包容量为10。
 * 结果：15
 * 
 * 
 * 完全背包
 * 设有n种物品，每种物品有一个重量及一个价值。但每种物品的数量是无限的，同时有一个背包，最大载重量为M，
 * 今从n种物品中选取若干件(同一种物品可以多次选取)，使其重量的和小于等于M，而价值的和为最大。
 * 
 * 假设4件物品，其重量分别是w={2，3，4，7}，价值分别是v={1,3,5,9}，背包容量为10。
 * 结果：12
 * 
 * @author Administrator
 *
 */
public class KnapsackCopy {
	
	public static void main(String[] args) {
		zero_one_Knapsack();
		all_Knapsack();
	}
	
	/**
	 * 完全背包问题
	 * 设有n种物品，每种物品有一个重量及一个价值。但每种物品的数量是无限的，同时有一个背包，最大载重量为M，今从n种物品中选取若干件(同一种物品可以多次选取)，使其重量的和小于等于M，而价值的和为最大。
	 * 
	 */
	public static void all_Knapsack()
	{
		int[] w = { 2,3,4,7 }; 	// 物品重量
		int[] v = { 1,3,5,9 }; 	// 物品价值
		int c=10;				//背包容量
		int n=w.length;
		
		int dp[]=new int[c+1];
		
		for(int i=0;i<n;i++)
		{
			for(int j=w[i];j<=c;j++)
			{
				dp[j]=Math.max(dp[j], dp[j-w[i]]+v[i]);
			}
		}
		
		System.out.println(dp[c]);
	}
	
	/**
	 * 0-1背包，一维数组解法
	 */
	public static void zero_one_Knapsack()
	{
		int[] w = { 2, 2, 6, 5, 4 }; // 物品重量
		int[] v = { 6, 3, 5, 4, 6 }; // 物品价值
		int c = 10; // 背包容量
		int n=w.length;
		
		int dp[]=new int[c+1];
		for(int i=0;i<n;i++)
		{
			for(int j=c;j>=w[i];j--)
			{
				dp[j]=Math.max(dp[j], dp[j-w[i]]+v[i]);
			}
		}
		
		System.out.println(dp[c]);
	}
	
	public static void zero_one_Knapsack2()
	{
		int[] w = { 2, 2, 6, 5, 4 }; // 物品重量
		int[] v = { 6, 3, 5, 4, 6 }; // 物品价值
		int c = 10; // 背包容量
		int[] x = new int[5]; // 记录物品装入情况，0表示不转入，1表示装入
		x[0] = 1; // 初始值表示第一个物品已装入背包
		int[][] m = new int[5][c + 1];// 需要维护的二维表，为了方便计算加入一列，其中第0列表示背包容量为0时背包的最大价值为0
		/*
		 * 初始化第一行，即背包中装入第一件物品
		 */
		for (int j = 1; j <= c; j++) {
			if (j >= w[0]) {
				m[0][j] = v[0];
			}
		}
		/*
		 * 背包中依次装入其他的物品
		 */
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= c; j++) {
				if (j < w[i])
					m[i][j] = m[i - 1][j]; // 不装入背包
				else {
					//是否要装第i个物品,不装第i个物品的总价值f[i-1][j]，装第i个物品的总价值f[i-1][j-w[i]]+v[i]
					m[i][j]=Math.max(m[i-1][j], m[i-1][j-w[i]]+v[i]);
				}
			}
		}
		System.out.println("背包的最大价值为：" + m[w.length - 1][c]);
		for (int i = 4; i >= 1; i--) {
			if (m[i][c] > m[i - 1][c]) {
				x[i] = 1; // 装入背包
				c -= w[i]; // 物品i装入背包之前背包的容量
			} else
				x[i] = 0; // 没有装入背包
		}
		System.out.print("装入背包的物品编号是：");
		for (int i = 0; i < 5; i++) {
			if (x[i] == 1)
				System.out.printf("%2d", (i + 1));
		}
	}
	
	private static void beibao()
	{
		int c=10;				//背包容量
		int n=5;				//物品个数
		
//		int[] w={2,2,6,5,4};	//重量
//		int[] v={6,3,5,4,6};	//价值
		
		int[] w={5,2,6,2,4};	//重量
		int[] v={4,3,5,6,6};	//价值
//		
		int f[][]=new int[n][c+1];
		int[] x = new int[n]; // 记录物品装入情况，0表示不转入，1表示装入
//		x[0] = 1; // 初始值表示第一个物品已装入背包
		
		for(int j=1;j<=c;j++)
		{
			if(j>=w[0]){
				f[0][j]=v[0];
			}
		}
		
		for(int i=1;i<n;i++)
		{
			for(int j=1;j<=c;j++)
			{
				if(j<w[i])
				{
					f[i][j]=f[i-1][j];
				}else{
					//是否要装第i个物品,不装第i个物品的总价值f[i-1][j]，装第i个物品的总价值f[i-1][j-w[i]]+v[i]
					f[i][j]=Math.max(f[i-1][j], f[i-1][j-w[i]]+v[i]);
				}
			}
		}
		
		System.out.println(f[4][10]);
		
		//求出装入的物品序列
		for(int i=4;i>=1;i--)
		{
			if(f[i][c]>f[i-1][c])
			{
				x[i]=1;
				c-=w[i];
			}else{
				x[i]=0;
			}
		}
		
		//上面for循环并没有考虑第一个是否放入
		if(w[0]<=c){
			x[0]=1;
		}
		
		for (int i = 0; i < 5; i++) {
			if (x[i] == 1)
				System.out.print((i + 1)+" ");
		}
		System.out.println();
	}

	/**
	 * 打印数组
	 * @param array
	 */
	public static void printArr(int[] array)
	{
		for (int i : array) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
}

/**
 * 
 * 
 * 	01背包（ZeroOnePack）: 有N件物品和一个容量为c的背包。（每种物品均只有一件）第i件物品的费用是w[i]，价值是v[i]。求解将哪些物品装入背包可使价值总和最大。
        
	完全背包(CompletePack): 有N种物品和一个容量为c的背包，每种物品都有无限件可用。第i种物品的费用是w[i]，价值是v[i]。求解将哪些物品装入背包可使这些物品的费用总和不超过背包容量，且价值总和最大。

	多重背包(MultiplePack): 有N种物品和一个容量为c的背包。第i种物品最多有n[i]件可用，每件费用是w[i]，价值是v[i]。求解将哪些物品装入背包可使这些物品的费用总和不超过背包容量，且价值总和最大。
 * 
 * 
 * 01背包解析：
 * 逆序的原因在于：是为了 max{}中的两项是前一状态值。f[j]需要表示当前状态是容量为j的背包所得价值，而f[j]和f[j-w[i]]+v[i]要表示前一状态的价值
 * 	for i=1..N
	   for(j=c;j>=w[i];j--)
	   		f[j]=max{ f[j], f[j-w[i]]+v[i] }
 * 
 * 
 * 完全背包解析：
 * 顺序的原因在于：max{} 中的两项是当前状态的值。 因为每种背包都是无限的。当我们把i从1到N循环时，f[v]表示容量为v在前i种背包时所得的价值，这里我们要添加的不是前一个背包，而是当前背包。所以我们要考虑的当然是当前状态。
	for(int i=0;i<n;i++)
		for(int j=w[i];j<=c;j++)
			f[j]=max{ f[j], f[j-w[i]]+v[i] };
 * 
 * 
 */



