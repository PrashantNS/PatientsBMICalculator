package com.bmi.bean;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class PatientsDetails {

	private List<Patient> patientsList;
	
	private static PatientsDetails pd;
	
	private PatientsDetails() {
		patientsList = new ArrayList<Patient>();
	}
	
	/**
	 * 
	 * @return
	 */
	public static PatientsDetails getInstance() {
		if (pd == null) {
			pd = new PatientsDetails();
			return pd;
		}else {
			return pd;
		}
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Patient> getPatients(){
		try {
			FileReader reader = new FileReader("C://patients.json");
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(reader);
			JSONObject jsonObject = (JSONObject)obj;
			JSONArray patientList = (JSONArray) jsonObject.get("patients");
			Patient patient;
			patientsList.clear();
			
			for(int i=0; i<patientList.size();i++) {
				JSONObject jsonObj = (JSONObject) patientList.get(i);
				patient = new Patient();
				long height = (Long)jsonObj.get("height");
				long weight = (Long)jsonObj.get("weight");
				patient.setName((String)jsonObj.get("name"));
				patient.setAge((Long)jsonObj.get("age"));
				patient.setHeight(height);
				patient.setWeight(weight);
				double bmi = (double)weight/(height*height);
				patient.setBmi((Double)bmi);
				patientsList.add(patient);
			}
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		//return the final list
		return patientsList;
	}
}
