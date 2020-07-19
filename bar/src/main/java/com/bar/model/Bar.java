package com.bar.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString
@Builder
public class Bar {

	@Id
	private Long id;
	@Column
	private String name;
}
