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
@Table(name = "COM_CATEGORY")
public class comCategory {
	
	@Id
	@Column(name = "CAT_ID")
	private String catId;
	
	@Column(name = "CAT_NAME")
	private String catName;
}
