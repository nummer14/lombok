package com.example.lombok_demo;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Builder
@Getter
@RequiredArgsConstructor
class  DailySales {
	@NonNull
	private final LocalDate saleDate;
	@NonNull
	private final BigDecimal totalAmount;
	private final int orderCount;
}


public class LombokDemoApplication {
	public static void main(String[] args) {
		DailySales ds = DailySales.builder()
				.saleDate(LocalDate.of(2025, 7,4))
				.totalAmount(new BigDecimal("10000.00"))
				.orderCount(20)
				.build();

		System.out.println(ds.getOrderCount());
	}
}
