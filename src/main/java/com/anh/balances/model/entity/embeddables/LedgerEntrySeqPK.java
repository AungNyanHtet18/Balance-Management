package com.anh.balances.model.entity.embeddables;

import java.time.LocalDate;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor   //default constructor need for using jpa 
@AllArgsConstructor  //all argument constructor does not support no argument constructor
public class LedgerEntrySeqPK {
    
	private long memberId;
	private LocalDate issueDate;
	
}
