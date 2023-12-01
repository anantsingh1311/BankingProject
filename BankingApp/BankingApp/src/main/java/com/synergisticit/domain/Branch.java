package com.synergisticit.domain;

import java.util.List;
import java.util.ArrayList;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Branch {
	
	@NotEmpty
	@NotNull
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private Long branchId;
	
	@NotEmpty
	private String branchName;
	
	@NotEmpty
	@Embedded
	private Address branchAddress;
	
	@OneToMany(mappedBy="accountBranch")
	private List<Account> branchAccount = new ArrayList<>();
	
	
	
}
