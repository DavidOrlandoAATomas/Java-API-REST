package me.david.java_bootcamp.domain.repository;

import me.david.java_bootcamp.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);

}
