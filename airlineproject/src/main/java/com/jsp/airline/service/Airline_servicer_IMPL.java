package com.jsp.airline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.airline.Repository.Airline_repository;
import com.jsp.airline.dto.Airline_info_dto;
@Service
public class Airline_servicer_IMPL implements Airline_service{
	@Autowired
	Airline_repository airline_repository;

	@Override
	public int addAirlineDetails(Airline_info_dto dto) {
		AirlineInformation info = airline_repository
				            .save(Airline.builder()
				            .airlineName(dto.getAirlineName()
				            .build());
		return 0;
	}
	

}
