package com.revature.eval.java.core;

public class Driver {
	public static void main(String[] args) {
		EvaluationService eval = new EvaluationService();
		System.out.println(eval.reverse("bjerke"));
		System.out.println(eval.acronym("big blue cockroach"));
		
	}
}
