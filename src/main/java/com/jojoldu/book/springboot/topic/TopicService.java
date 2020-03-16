package com.jojoldu.book.springboot.topic;


import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topic = Arrays.asList(
            new Topic("spring", "springframework", "blabla"),
                new Topic("java", "java spring", "java blabla"),
                new Topic("python", "pyhton framework", "pyhton blabla")
                );
    public List<Topic> main(){
        return topic;
    }

    public Topic getTopic(String id) {
        return topic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }
}
