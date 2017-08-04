package com.hoau.hoauapp.entity;

import java.util.Random;


public class ValidateCode {
	public static final String[] nums = {"0","1","2","3",
										 "4","5","6","7",
										 "8","9"};
	public static String genCode(){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 4; i++){
			int index = getRandomNum();
			sb.append(nums[index]);
		}
		return sb.toString();
	}
	
	public static int getRandomNum(){
		Random r = new Random();
		return r.nextInt(10);
	}
	
}
