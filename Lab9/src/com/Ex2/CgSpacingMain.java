package com.Ex2;

public class CgSpacingMain {
	
	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		CgSpacing obj = (str) -> {
			for (int i = 0; i < str.length(); i++) {
				sb.append(str.charAt(i) + " ");
			}
			return sb;
		};
		StringBuffer str2 = obj.s("CG");
		System.out.println(str2);

		}
}
