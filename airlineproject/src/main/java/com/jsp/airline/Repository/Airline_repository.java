package com.jsp.airline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.airline.dto.Airline_info_dto;

public interface Airline_repository extends JpaRepository<Airline_info_dto,Integer>{

}
