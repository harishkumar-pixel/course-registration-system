package com.example.Course.Registartion.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Course.Registartion.System.model.course;

@Repository
public interface CourseRepo extends JpaRepository<course, String> {

}
