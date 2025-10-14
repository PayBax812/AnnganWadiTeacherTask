package com.example.TeacherPage.repository;

import com.example.TeacherPage.model.teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<teacher, Long> {
}
