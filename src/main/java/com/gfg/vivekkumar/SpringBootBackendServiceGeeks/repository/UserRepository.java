package com.gfg.vivekkumar.SpringBootBackendServiceGeeks.repository;

import com.gfg.vivekkumar.SpringBootBackendServiceGeeks.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
