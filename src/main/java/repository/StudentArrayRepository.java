package com.exam.onlineexamsystem.repository;

import com.exam.onlineexamsystem.entity.StudentArray;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentArrayRepository extends JpaRepository<StudentArray, Long> {

}