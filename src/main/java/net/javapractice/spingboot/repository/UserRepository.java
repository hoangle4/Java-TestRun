package net.javapractice.spingboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javapractice.spingboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
