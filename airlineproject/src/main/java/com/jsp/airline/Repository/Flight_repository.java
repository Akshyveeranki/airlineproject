package com.jsp.airline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.airline.dto.Flight_dto;

public interface Flight_repository extends JpaRepository<Flight_dto,Integer>{

}
