package com.example.lombok_demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Memo {
	private int id;
	private String title;
	private String content;
}



public class LombokDemoApplication {
	public static void main(String[] args) {
		Memo memo = new Memo();
		memo.setTitle("Hello, Lombok!");
		assert "Hello, Lombok!".equals(memo.getTitle());
	}
}