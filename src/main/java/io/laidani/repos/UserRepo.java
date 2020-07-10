package io.laidani.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.laidani.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
