package com.gfg.vivekkumar.SpringBootBackendServiceGeeks.repository;

import com.gfg.vivekkumar.SpringBootBackendServiceGeeks.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
