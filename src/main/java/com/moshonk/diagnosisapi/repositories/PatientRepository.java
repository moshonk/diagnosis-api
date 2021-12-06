package com.moshonk.diagnosisapi.repositories;

import com.moshonk.diagnosisapi.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, long> {

}
