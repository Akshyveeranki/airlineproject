package com.jsp.airline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.airline.dto.Flight_info_dto;

public interface Flight_info_repository extends JpaRepository<Flight_info_dto,Integer>{

}
