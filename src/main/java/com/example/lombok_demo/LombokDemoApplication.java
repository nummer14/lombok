package com.example.lombok_demo;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
class DailySales {
	private LocalDate saleDate;
	private BigDecimal totalAmount;
	private int orderCount;

	@Override
	public String toString() {
		return "DailySales(saleDate=" + saleDate
				+ ", totalAmount=" + totalAmount
				+ ", orderCount=" + orderCount + ")";
	}
}


public class LombokDemoApplication {
	public static void main(String[] args) {
		DailySales ds = new DailySales(LocalDate.of(2025, 7, 4), new BigDecimal("10000.00"), 3);

		System.out.println(ds.toString());;
	}
}