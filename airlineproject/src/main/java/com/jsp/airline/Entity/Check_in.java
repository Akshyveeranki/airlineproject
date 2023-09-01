package com.jsp.airline.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name= "check_in")
public class Check_in {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int checkInId;
	private int gateNumber;
	private int seatNumber;

}
