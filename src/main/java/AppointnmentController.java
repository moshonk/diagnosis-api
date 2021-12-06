import com.moshonk.diagnosisapi.entities.Appointment;
import com.moshonk.diagnosisapi.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AppointmentController {

	@Autowired
	private AppointmentRepository appointmentRepository;

	@GetMapping("/users")
	public List<Appointment> appointmentList() {
		return appointmentRepository.findAll();
	}

	/**
	 * Create an appointment.
	 *
	 * @param appointment the appointment
	 * @return the appointment
	 */
	@PostMapping("/appointment")
	public Appointment createAppointment(@Valid @RequestBody Appointment appointment) {
		return appointmentRepository.save(appointment);
	}
}
