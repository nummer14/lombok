package com.example.lombok_demo;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
class DailySales {
	private final LocalDate saleDate;
	private final BigDecimal totalAmount;
	private final int orderCount;
}


public class LombokDemoApplication {
	public static void main(String[] args) {
		DailySales ds = new DailySales(LocalDate.of(2025, 7, 4), new BigDecimal("10000.00"), 3);

		System.out.println(ds);
	}
}