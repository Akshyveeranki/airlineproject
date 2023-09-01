package com.jsp.airline.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class Flight_dto {
	private String destination;
	private LocalDate flightDate;
	private int flightNumber;
	private LocalTime flightTime;
	private String currentLocation;

}
