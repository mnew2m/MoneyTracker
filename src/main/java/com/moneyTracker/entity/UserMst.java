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
@Table(name = "USER_MST")
public class UserMst {
	
	@Id
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "USER_PW", nullable = false)
	private int userPw;
}
