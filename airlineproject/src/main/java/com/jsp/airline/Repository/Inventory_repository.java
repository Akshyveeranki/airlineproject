package com.jsp.airline.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.airline.Entity.Inventory;

public interface Inventory_repository extends JpaRepository<Inventory,Integer>{

}
