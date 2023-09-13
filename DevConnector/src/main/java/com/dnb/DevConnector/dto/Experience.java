package com.dnb.DevConnector.dto;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.dnb.DevConnector.utils.CustomIdGenerator;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString
@Entity
public class Experience {
	@Id
	@NotBlank(message = "expid cannot be blank")
	//@GeneratedValue(strategy = GenerationType.UUID)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "experience_seq")
	@GenericGenerator(name = "experience_seq", strategy = "com.dnb.DevConnector.utils.CustomIdGenerator",
	parameters = {@Parameter(name=CustomIdGenerator.INCREMENT_PARAM, value = "50"),
			@Parameter(name=CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "Exp_"),
			@Parameter(name=CustomIdGenerator.DATE_FORMAT_PARAMETER, value = "false"),
			@Parameter(name=CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d")
			})
	private String expId;
	private String job_title;
	private String company;
	private String location;
	private String from_date;
	private String to_date;
	private boolean currentjob;
	private String job_description;

}
