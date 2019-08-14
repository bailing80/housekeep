package com.ccunix.ihousekeeping.base.util;

import java.lang.management.ManagementFactory;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class ShortId {
	/**
	 * 默认的随机码的字母模板
	 */
	private static String ORIGINAL = "0123456789abcdefghjkmnopqrstuvwx";
	/**
	 * 2018-10-3 11:03:56 减去1970年1月1日00:00:00 忽略某个时间之前的所有毫秒，以减少日期熵的大小，同时不牺牲唯一性。
	 * 这个数字应该每年更新一次，以保持生成的id较短。 重新生成' new Date() - 0 '，并将版本提升。总是碰撞版本!
	 */
	private static long REDUCE_TIME = 1538535836552L;
	/**
	 * 版本
	 */
	private static int version = 1;
	/**
	 * 计数器用于在一秒钟内多次调用shortid。
	 */
	private static int counter = 0;
	/**
	 * 记得上次 的 shortid 是为了以防万一。
	 */
	private static int previousSeconds;

	/**
	 * 生成唯一的shortid
	 * 
	 * @return shortid
	 */
	public static String build() {
		// 获取当前进程id
		String name = ManagementFactory.getRuntimeMXBean().getName();
		int clusterWorkerId = Integer.parseInt(name.split("@")[0]);

		String str = "";
		// 计算当前时间于设置的初始时间差并缩小一千倍 降低shortid长度的增长速度
		int seconds = (int) Math.floor((new Date().getTime() - REDUCE_TIME) * 0.001);
		// 判断是否在同一秒内作shortid生成操作 如果是使用counter来添加shortid的长度
		if (seconds == previousSeconds) {
			counter++;
		} else {
			counter = 0;
			previousSeconds = seconds;
		}
		// generate(number) 中的number 决定这次调用生成的这一截shortid的字符长度
		// 根据版本生成shortid的前缀
		str = str + generate(version);
		// 根据子线程id生成shortid中间部分 如果当前为主线程则clusterWorkerId=0
		str = str + generate(clusterWorkerId);
		// 判断是否为同一秒的操作 如果是则使用counter来添加shortid的长度
		if (counter > 0) {
			str = str + generate(counter);
		}
		// 根据当前时间余设定时间的差值生成shortid的后缀
		str = str + generate(seconds);
		return str;
	}

	/**
	 * 生成随机字符串
	 * 
	 * @param number
	 *            通过判断number与16的x次方比较决定字符串的长度
	 * @return 特定长度的随机字符串
	 */
	public static String generate(int number) {
		// 表示16的x次方中的x
		int loopCounter = 0;
		boolean done = false;
		// 返回的字符串
		String str = "";
		// 循环生成字符串
		while (!done) {
			// 调用format方法每次生成一个字符
			str = str + format(ORIGINAL, 1);
			// Math.pow(64, loopCounter + 1)中的64控制随机码的长度
			done = number < (Math.pow(16, loopCounter + 1));
			loopCounter++;
		}
		return str;
	}

	/**
	 * 随机生成一个特定长度的字符串
	 * 
	 * @param alphabet
	 *            随机码的字母模板
	 * @param size
	 *            字符串长度
	 * @return 特定长度的字符串
	 */
	public static String format(String alphabet, int size) {
		// 将随机码的字母模板转换为字符数组
		char[] alphabetArr = alphabet.toCharArray();
		int len = alphabetArr.length;

		// 使得mask永远位2^n-1 邀请字母模板的长度必需为2^n次方
		int mask = (2 << (int) Math.floor(Math.log(len - 1) / Math.log(2))) - 1;

		// 使step 的值为1-4 即format方法返回的字符串长度为[1.4]之间
		int step = (int) Math.ceil(1.6 * mask * size / len);
		// 返回的字符串
		String id = "";

		// while (true) {

		for (int i = 0; i < step; i++) {
			// 生成[0,255]之间的随机数
			int bytes = (int) Math.floor(Math.random() * 256);

			// 将随机数与数组长度作求余运算
			int byte1 = bytes & mask;

			// 判断alphabetArr中是否存在对应的元素
			// 要求alphabetArr的长度必须为2^n次方 否则有可能取不到值
			if (alphabetArr[byte1] + "" != "" || alphabetArr[byte1] + "" != null) {
				// alphabetArr中存在相应的值 将其追加到需要返回字符串中
				id += alphabetArr[byte1];
				// 判断需要返回的字符串是否满足要求如果是则推出循环
				if (id.length() == size) {
					break;
				}
			}
		}
		return id;
		// }
	}

	public static void main(String[] args) {
		// System.out.println(build(0));
		Set<String> set = new HashSet<String>();
		System.out.println("开始执行-----------");
		String str = "";
		for (int j = 0; j < 90000; j++) {
			for (int k = 0; k < 10; k++) {
				str = build();
//				try {
//					TimeUnit.MILLISECONDS.sleep(100);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				set.add(str);
			}
		}
		// 20 000 000 000
		System.out.println("执行结束-----------" + build());
		System.out.println("总数：" + set.size());
	}
}
