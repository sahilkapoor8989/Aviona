package com.sa.Aviona.repository;

import com.sa.Aviona.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
