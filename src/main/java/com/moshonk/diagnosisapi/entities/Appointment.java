package com.moshonk.diagnosisapi.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "appointment")
@EntityListeners(AuditingEntityListener)
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	@Column(name = appointment_date, nullable = false)
	private Date appointmentDate;

	@Column(name = docker, nullable = false)
	private String doctor;

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Patient getPatient() {
		return patient;
	}
}
