package com.anh.balances.controller.member.dto;

import java.math.BigDecimal;

/*
 * Pie Chart Data
 * 
 */
public record ChartAmountVo(
	String ledger,
	BigDecimal value) {
    
}
