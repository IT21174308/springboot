package org.springbootcrud.restapi.repository;

import org.springbootcrud.restapi.entity.student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<student ,Integer> {
}
