package com.example.lombok_demo;

import lombok.*;

@AllArgsConstructor
class Memo {
	private int id;
	private String title;
	private String content;
}


public class LombokDemoApplication {
	public static void main(String[] args) {
		Memo m1 = new Memo(1, "A", "B");
		Memo m2 = new Memo(2, "X", "Y");

		System.out.println(m1.equals(m2));
		System.out.println(m2.equals(m1));

		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m1.hashCode() == m2.hashCode());
	}
}