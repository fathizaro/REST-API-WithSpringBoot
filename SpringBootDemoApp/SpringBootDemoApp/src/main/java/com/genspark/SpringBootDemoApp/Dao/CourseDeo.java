package com.genspark.SpringBootDemoApp.Dao;

import com.genspark.SpringBootDemoApp.Entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseDeo extends JpaRepository<Course, Integer> {



}
