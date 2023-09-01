package com.jsp.airline.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Builder
@Table(name= "fare")
public class Fare {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int fareId;
	private double currency;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fare_Id")
	private Flight flight;

}
