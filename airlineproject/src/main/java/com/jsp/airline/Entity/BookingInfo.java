package com.jsp.airline.Entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name= "BookingInf")
public class BookingInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	private Date bookingDate;
	private String destination;
	private double fare;
	private int flightDate;
	private int flightNumber;
	private String status;
	private Time flightTime;
	private String currentCity;
	
	@OneToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinColumn(name ="Booking_id")
	private Passenger passenger;

}
