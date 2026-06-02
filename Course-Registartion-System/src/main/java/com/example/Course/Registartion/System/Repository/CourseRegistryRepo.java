package com.example.Course.Registartion.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Course.Registartion.System.model.CourseRegistry;

import jakarta.persistence.Id;

public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Id>{

}
