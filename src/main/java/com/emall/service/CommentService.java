package com.emall.service;

import com.emall.entity.Comment;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface CommentService {
    Comment getCommentById(@PathVariable("id") int id);


    List<Comment> list();


    int add(Comment comment);


    int update(Comment comment);
}
