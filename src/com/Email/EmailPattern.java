package com.Email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPattern {
    public static void main(String[] args) {
    	Pattern p= Pattern.compile("[.]+[a-z]{2}");
		Matcher m=p.matcher(".it");
		boolean matchfound=m.matches();
		if(matchfound) {
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");

	}
}
