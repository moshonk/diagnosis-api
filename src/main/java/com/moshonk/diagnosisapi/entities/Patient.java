package com.moshonk.diagnosisapi.entities;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "patient")
@EntityListeners(AuditingEntityListener.class)
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	public string getPatientName() {
		return patientName;
	}

	public void setPatientName(string patientName) {
		this.patientName = patientName;
	}

	@Column(name = "patient_name", nullable = false)
	private string patientName;

	@Column(name = "sex", nullable = false)
	private string sex;

	@Column(name = "age", nullable = false)
	private integer age;

}
