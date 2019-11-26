package application.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepo topicrepo;

    public List<Topic> getAllTopics(){
        List<Topic> topics = new ArrayList<>();
        topicrepo.findAll().forEach(topics::add);
        return topics;
    }
    public Topic getTopic(String id){
        return topicrepo.findOne(id);
    }
    public void addTopic(Topic topic){
        topicrepo.save(topic);
    }

    public void updateTopic(Topic topic) {
        topicrepo.save(topic);
    }

    public void deleteTopic(String id) {  topicrepo.delete(id); }
}
