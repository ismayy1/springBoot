package com.tpe.repository;

import com.tpe.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // optional, because we're extending this interface from JpaRepository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // In Spring Data JPS there's a default method existsById()
    // But we can update Id with any of the fields name, in this case existsByEmail()
    boolean existsByEmail(String email);
}
