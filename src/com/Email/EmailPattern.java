package com.Email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailPattern {
    public static void main(String[] args) {
    	Pattern p= Pattern.compile("^abc([.+_-]{0,1}[0-9a-z]+)?@[a-z0-9]+(\\.[a-z]{2,}){1,2}");
		Matcher m=p.matcher("abc-11@bridgelaz.com");
		boolean matchfound=m.matches();
		if(matchfound) {
			System.out.println("Valid");
		}
		else
			System.out.println("Invalid");

	}
}
