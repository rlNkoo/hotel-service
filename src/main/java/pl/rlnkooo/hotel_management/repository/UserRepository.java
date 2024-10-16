package pl.rlnkooo.hotel_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rlnkooo.hotel_management.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);
    Optional<User> findByEmail(String email);
}
