package com.bmi.calc;

/**
 * 
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = {"com.bmi"})
public class PatientsBmiCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientsBmiCalculatorApplication.class, args);
	}

}
