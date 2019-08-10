package com.liujingyan.utils;

import java.util.regex.Pattern;

import org.junit.Test;

public class CommonUtil {
	
	public static boolean isNumber(String src, String regex){
		return Pattern.compile(regex).matcher(src).matches();
	}
	
	
	public static boolean hasText(String src){
		if(!src.equals("")||src.trim()!=null){
			return true;
		}
		return false;
	}
	
	public static int getPlaceHolder(String url,String regex){
		String replaceAll = Pattern.compile(regex).matcher(url).replaceAll("");
		
		return hasText(replaceAll)?Integer.parseInt(replaceAll):0;
		
	}
	
	public static void main(String[] args) {
		getPlaceHolder("fasgifasb99977777fassa","[^0-9]");
	}
}
