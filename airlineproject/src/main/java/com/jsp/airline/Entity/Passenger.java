package com.jsp.airline.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name= "Passenger")
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int passenger_Id;
	private int email_Id;
	private String firstName;
	private String LastName;
	private String gender;
	private int mobileNumber;
	private int booking_Id;

}
