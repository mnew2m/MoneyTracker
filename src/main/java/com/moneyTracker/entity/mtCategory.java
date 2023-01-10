package com.moneyTracker.entity;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "MT_CATEGORY")
public class mtCategory {

	@Id
	@Column(name = "CAT_ID")
	private String catId;
	
	@Column(name = "CAT_NAME")
	private String catName;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID", nullable = false)
	private UserMst userMst;

	@ColumnDefault("'Y'")
	@Column(name = "USE_YN", length = 1, nullable = false)
	private String useYn;
}
