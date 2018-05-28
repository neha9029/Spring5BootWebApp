package com.nehanaik.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nehanaik.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{

}
