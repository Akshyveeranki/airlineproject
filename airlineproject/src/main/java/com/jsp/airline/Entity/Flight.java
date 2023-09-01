package com.jsp.airline.Entity;

import java.sql.Date;
import java.sql.Time;

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
@Table(name= "Flight")
public class Flight {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int flightId;
	private String desstination;
	private Date flightDate;
	private int flightNumber;
	private Time flightTime;
	private String curLocation;
	private int fareId;
	private int flightInfoId;
	private int inventoryId;

}
