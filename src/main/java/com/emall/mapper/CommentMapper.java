package com.emall.mapper;


import com.emall.entity.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface CommentMapper {

    Comment getCommentById(@PathVariable("id") int id);


    List<Comment> list();


    int add(Comment comment);


    int update(Comment comment);
}
