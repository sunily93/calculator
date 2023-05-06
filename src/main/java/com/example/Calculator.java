package com.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

	public static int add(String numbers) throws Exception {
		if(numbers==null || numbers.isEmpty())
		{
			return 0;
		}
		String delimeter=",";
		if(numbers.startsWith("//"))
		{
			int index = numbers.indexOf("\n");
			delimeter=numbers.substring(2, index);
			numbers=numbers.substring(index+1);
		}
		
		String[] numArray = numbers.split("[\n" + delimeter + "]");
	    int sum = 0;
	    List<Integer> negatives = new ArrayList<>();
	    for (String num : numArray) {
	        int n = Integer.parseInt(num);
	        if (n < 0) {
	            negatives.add(n);
	        } else {
	            sum += n;
	        }
	    }
	    if (!negatives.isEmpty()) {
	        throw new Exception("negatives not allowed: " + negatives);
	    }

	    return sum;
	}
}
