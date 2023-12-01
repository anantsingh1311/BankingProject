package com.synergisticit.domain;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Account {
	
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long accountId;
	
	@NotEmpty
	private String accountHolder;
	
	@Enumerated(EnumType.STRING)
	private AccountType accountType; 
	
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	private LocalDate accountDateOpen;
	
	private double accountBalance;
	
	@JoinColumn(name="branchId")
	@ManyToOne
	private Branch accountBranch;
	
	@JoinColumn(name="customerId")
	@ManyToOne
	private Customer accountCustomer;
	
	
}
