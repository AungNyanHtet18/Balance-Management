package com.anh.balances.model.entity;


import com.anh.balances.model.entity.embeddables.LedgerEntryPk;
import com.anh.balances.model.entity.embeddables.LedgerEntrySeqPK;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class LedgerEntrySeq {
    
	@EmbeddedId
	private LedgerEntrySeqPK id;
	
	@Column(nullable = false)
	private int seqNumber;

	public LedgerEntryPk next() {
		 seqNumber ++;
		return LedgerEntryPk.from(this);
	}
	
}
