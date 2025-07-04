package com.example.lombok_demo;

import lombok.*;

@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
class Memo {
	@ToString.Include
	private int id;
	private String title;
	private String content;
}


public class LombokDemoApplication {
	public static void main(String[] args) {
		Memo m1 = new Memo(1, "A", "B");
		Memo m2 = new Memo(1, "X", "Y");

		System.out.println(m1);
		System.out.println(m2);
	}
}