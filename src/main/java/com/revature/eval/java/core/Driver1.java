package com.revature.eval.java.core;

import java.util.HashMap;
import java.util.Map;

import com.revature.eval.java.core.EvaluationService.Triangle;

public class Driver1 {

	public static void main(String[] args) {
			Triangle t = new Triangle(12.0,11.0,12.0);
			EvaluationService eval = new EvaluationService();
			System.out.println(eval.reverse("bjerke"));
			System.out.println(eval.acronym("big blue cockroach"));
			System.out.println(t.isIsosceles());
			
	}


public Map<String, Integer> wordCount(String string) {
	HashMap<String, Integer> hmap = new HashMap<>();
	String[] words;
	words=string.split("(\\w)([\\,])");
	for (int i=0; i<words.length; i++) {
		int c = hmap.get(words[i]); 
		hmap.put(words[i], ++c); 
		System.out.println(words[i]);

	}
	return hmap;
}
}