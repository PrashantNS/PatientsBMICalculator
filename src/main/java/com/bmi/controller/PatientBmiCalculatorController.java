package com.bmi.controller;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bmi.bean.Patient;
import com.bmi.bean.PatientsDetails;

@Controller
public class PatientBmiCalculatorController {

	@RequestMapping(method=RequestMethod.GET, value="patient/all")
	@ResponseBody
	public List<Patient> getPatients(){
		return PatientsDetails.getInstance().getPatients();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/patient/{name}")
	public void updatePatient() {
		
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/patient/{name}")
	public void addPatient() {
		
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/patient/{name}")
	public void deletePatient() {
		
	}
}
