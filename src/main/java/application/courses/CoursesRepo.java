package application.courses;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CoursesRepo extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);

}
