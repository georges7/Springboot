package application.courses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CoursesService {

    @Autowired
    private CoursesRepo courseRepo;

    public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        courseRepo.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }
    public Course getCourse(String id){
        return courseRepo.findOne(id);
    }
    public void addCourse(Course course){
        courseRepo.save(course);
    }

    public void updateCourse(Course course) {
        courseRepo.save(course);
    }

    public void deleteCourse(String id) {

        courseRepo.delete(id);
    }
}
