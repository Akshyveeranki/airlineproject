package com.jsp.airline.dto;

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
public class Flight_info_dto {
	private String flightNo;
	private LocalTime flighttime;
	private String flightType;

}
