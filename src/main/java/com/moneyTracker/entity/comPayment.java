package com.moneyTracker.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "COM_PAYMENT")
public class comPayment {
	
	@Id
	@Column(name = "PAY_ID")
	private String payId;
	
	@Column(name = "PAY_NAME")
	private String payName;
}
