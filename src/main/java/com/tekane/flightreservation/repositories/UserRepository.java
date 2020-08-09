package com.tekane.flightreservation.repositories;

import com.tekane.flightreservation.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
   public User findByEmail(String email);
}
