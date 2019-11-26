package application.courses;

import application.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CoursesController {

    @Autowired
    private CoursesService coursesService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return coursesService.getAllCourses(id);
    }
    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course getCourses(@PathVariable String id){
        return coursesService.getCourse(id);
    }
    @RequestMapping(method= RequestMethod.POST,value="/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "", ""));
        coursesService.addCourse((course));
    }
    @RequestMapping(method= RequestMethod.PUT,value="/topics/{topicId}/courses/{id}")
    public void putCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId, "", ""));
        coursesService.updateCourse(course);
    }
    @RequestMapping(method= RequestMethod.DELETE,value="/topics/{topicId}/courses/{id}")
    public void deleteCourse(@PathVariable String id){

        coursesService.deleteCourse(id);
    }



}
