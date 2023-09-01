package com.jsp.airline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.airline.dto.Fare_info_dto;

public interface Fare_repository extends JpaRepository<Fare_info_dto,Integer>{

}
