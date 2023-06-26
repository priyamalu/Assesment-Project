package com.ikm.filemgmnt.model;

import java.sql.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.validation.annotation.Validated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Validated

@Table(name = "citizen")
public class CitizenModel {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank
    @Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private String phone;

    @Past(message="Date of birth cannot be greater or equal to current date")
    @Column(name = "dateOfBirth")
	private Date dateOfBirth;
    
}
