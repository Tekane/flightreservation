package com.tekane.flightreservation;

import com.tekane.flightreservation.beans.User;
import com.tekane.flightreservation.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlightreservationApplicationTests {

	@Autowired
	private UserRepository userRepository;
	@Test
	void contextLoads() {
		User user = new User();
		user.setEmail("phasha15@gmail.com");
		user.setFirstName("Tekane");
		user.setLastName("Phasha");

		userRepository.save(user);
	}

}
