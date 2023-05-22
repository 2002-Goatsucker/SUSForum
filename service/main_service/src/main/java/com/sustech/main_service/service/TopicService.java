package com.sustech.main_service.service;

import com.sustech.main_service.entity.Comment;
import com.sustech.main_service.entity.Topic;

import java.util.List;

/**
 * @author Lynchrocket
 * @description 针对表【t_topic(话题表)】的数据库操作Service
 * @createDate 2023-04-08 22:35:49
 */
public interface TopicService {
    boolean addTopic(Topic topic);

    boolean deleteTopic(String id);

    boolean addComment(String user_id, String topic_id, String info, String path);

    List<Comment> getTopicComments(String id);

    Topic getByTopicId(String id);

    List<Topic> getTopicPage(int currentPage, int pageSize);

    List<Topic> getUserTopics(String userId);
}
