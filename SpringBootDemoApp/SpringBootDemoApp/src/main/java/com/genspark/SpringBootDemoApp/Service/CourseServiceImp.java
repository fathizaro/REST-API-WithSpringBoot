package com.genspark.SpringBootDemoApp.Service;

import com.genspark.SpringBootDemoApp.Dao.CourseDeo;
import com.genspark.SpringBootDemoApp.Entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImp implements CourseService{
    @Autowired
    private CourseDeo courseDeo;


    @Override
    public List<Course> getAllCourses() {

        return this.courseDeo.findAll();
    }

    @Override
    public Course getCourseById(int courseId) {
        Optional<Course> c = this.courseDeo.findById(courseId);
        Course course = null;
        if(c.isPresent()){
            course = c.get();
        }else{
            throw new RuntimeException("Course not found for id :: "+courseId);
        }
        return course;
    }

    @Override
    public Course addCourse(Course course) {


        return this.courseDeo.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
       return this.courseDeo.save(course);
    }

    @Override
    public String deleteCourseByID(int courseID) {
      this.courseDeo.deleteById(courseID);
        return "Deleted Successfully";
    }


}
