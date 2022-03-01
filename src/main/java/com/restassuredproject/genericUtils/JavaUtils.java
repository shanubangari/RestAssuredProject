package com.restassuredproject.genericUtils;

import java.util.Random;

/**
 * @author Santhosha M
 *Logic for get random number.
 */
public class JavaUtils {
	public static String getRandomNum() {
		Random ran=new Random();
		int rannum=ran.nextInt(1000);
		return ""+rannum;
	}

}
