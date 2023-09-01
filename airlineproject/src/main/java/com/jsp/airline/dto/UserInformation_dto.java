package com.jsp.airline.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class UserInformation_dto {
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String gender;
	private String userName;
	private String password;

}
