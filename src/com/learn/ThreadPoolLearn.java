package com.learn;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 线程池学习
 * @author Administrator
 *
 */
public class ThreadPoolLearn {

	public static void main(String[] args)
	{
		ExecutorService executorService=Executors.newCachedThreadPool();
	}

}
