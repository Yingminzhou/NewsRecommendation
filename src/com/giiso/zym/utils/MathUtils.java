package com.giiso.zym.utils;

public class MathUtils {

	public static String getHexDigest(byte[] hash) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("");  
		char[] chars = "0123456789ABCDEF".toCharArray();
		int bit;
		for(int i = 0; i < hash.length ; i++){
			bit = (hash[i] & 0x0f0) >> 4; 
			sb.append(chars[bit]); 
			bit = hash[i] & 0x0f; 
			sb.append(chars[bit]); 
			sb.append(' ');
		}
		return sb.toString();
	}

}
