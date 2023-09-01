package com.jsp.airline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.airline.dto.UserInformation_dto;

public interface User_Repository extends JpaRepository<UserInformation_dto,Integer>{

}
