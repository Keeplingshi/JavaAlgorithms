package com.algorithm;

/**
 * 0-1背包问题
 * 
 * 现有n件物品和一个容量为c的背包。第i件物品的重量是重量为w[i]，价值是v[i]。
 * 已知对于一件物品必须选择取（用1表示）或者不取（用0表示），且每件物品只能被取一次（这就是“0-1”的含义）。
 * 求放置哪些物品进背包，可使这些物品的重量总和不超过背包容量，且价值总和最大。
 * 
 * 假设有5件物品，其重量分别是w={2，2，6，5，4}，价值分别是v={6，3，5，4，6}，背包容量为10。
 * 
 * @author Administrator
 *
 */
public class Question1 {
	public static void main(String[] args) {
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
					if (m[i - 1][j - w[i]] + v[i] > m[i - 1][j])
						m[i][j] = m[i - 1][j - w[i]] + v[i]; // 选择价值较大者
					else
						m[i][j] = m[i - 1][j];
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

}
