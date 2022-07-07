package com.example.demo.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
	 private Integer empId;
	 private String empName;
	 private Double empSal;
	 private String empPwd;
	 private String empGen;
	 private String empDept;
	 private String empAddr;
	 
	 private List<String> empClients;
	 private List<String> empSlots;
	 
	 private Double empAge;
	 private String empJoinDate;
	 private String empNewDate;
	 private String empColor;
	 
}
