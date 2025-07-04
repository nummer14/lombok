package com.example.lombok_demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

class CustomerRank {
	private int customerId;
	private BigDecimal totalSpent;
	private int rank;

	public CustomerRank() {}

	public CustomerRank(int customerId, BigDecimal totalSpent, int rank) {
		this.customerId = customerId;
		this.totalSpent = totalSpent;
		this.rank = rank;
	}
}


public class LombokDemoApplication {
	public static void main(String[] args) {
		CustomerRank cr1 = new CustomerRank();
		CustomerRank cr2 = new CustomerRank(1, new BigDecimal("10000.00"), 1);
	}
}