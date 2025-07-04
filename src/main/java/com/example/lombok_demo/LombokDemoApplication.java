package com.example.lombok_demo;

class Memo {
	private int id;
	private String title;
	private String content;

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}
}



public class LombokDemoApplication {
	public static void main(String[] args) {
		Memo memo = new Memo();
		memo.setTitle("Hello, Lombok!");
		System.out.println(memo.getTitle());
	}
}