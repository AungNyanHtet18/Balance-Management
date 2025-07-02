package com.anh.balances.controller.member.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

/*
 * Bar Chart Data
 * 
 */

public record ChartBalanceVo(
	LocalDate date,
	BigDecimal incomes,
	BigDecimal expenses){

}
