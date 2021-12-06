package com.moshonk.diagnosisapi.repositories;

import com.moshonk.diagnosisapi.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, long> {

}
