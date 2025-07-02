package com.anh.balances.controller.member;

import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anh.balances.controller.member.dto.ChartAmountVo;
import com.anh.balances.controller.member.dto.ChartBalanceVo;
import com.anh.balances.controller.member.dto.ChartSummaryVo;
import com.anh.balances.model.entity.consts.BalanceType;
import com.anh.balances.service.MemberChartService;
import com.anh.balances.utils.LoadType;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("member/chart")
@RequiredArgsConstructor
public class MemberChartApi {
     
	private final MemberChartService service;
	
	  @GetMapping("summary")
	  ChartSummaryVo getSummaryData(@RequestParam(required = false,defaultValue = "Monthly") LoadType type) {
	      /*
		  return switch(type) {
		     case Monthly ->  new ChartSummaryVo(BigDecimal.valueOf(500000), BigDecimal.valueOf(150000));
		     case Yearly  ->   new ChartSummaryVo(BigDecimal.valueOf(2500000), BigDecimal.valueOf(300000));
	     };
	     */
		  
		  return service.getSummaryData(type);
	  }
	  
     @GetMapping("balance")
	 List<ChartBalanceVo> getBalanceData(@RequestParam(required = false,defaultValue = "Monthly") LoadType type){
    	 //Supplier<BigDecimal> generator = () -> BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(999999999));
    	
    	 /*
    	 return IntStream.iterate(1, a-> a+1)
    			         .limit(10)
    			          .mapToObj(a -> new ChartBalanceVo(
    			           LocalDate.now().minusDays(10).plusDays(a), 
    			          generator.get(),
    			          generator.get()))
    			          .toList();
	     */
    	 
    	 
    	 return service.getBalanceData(type);
	 }
     
     @GetMapping("ledger")
     Map<BalanceType, List<ChartAmountVo>> getLedgerData(@RequestParam(required = false,defaultValue = "Monthly") LoadType type){
    	/*
    	 var map = new HashMap<BalanceType,List<ChartAmountVo>>(); 
    	 Supplier<BigDecimal> generator = () -> BigDecimal.valueOf(ThreadLocalRandom.current().nextDouble(999999999));
            
    	 map.put(BalanceType.Incomes, 
    			 IntStream.iterate(1, a -> a+1).limit(5)
    			          .mapToObj(a -> new ChartAmountVo("Income %d".formatted(a), generator.get()))
    			          .toList());
    	 
    	 map.put(BalanceType.Expenses, 
    			 IntStream.iterate(1, a -> a+1).limit(5)
    			          .mapToObj(a -> new ChartAmountVo("Expense %d".formatted(a), generator.get()))
    			          .toList());
    	 
    	 return map;
    	 */
    	 
    	 return service.getLedgerData(type);
     }

}
