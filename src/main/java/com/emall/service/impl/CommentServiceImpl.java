package com.emall.service.impl;



/**
 * @author GJ
 * @Description CommentServiceImpl
 * @date 2022/09/02/ 15:50
 */

import com.emall.entity.Comment;
import com.emall.mapper.CommentMapper;
import com.emall.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;

    @Override
    public Comment getCommentById(int id){ return commentMapper.getCommentById(id);}

    @Override
    public List<Comment> list(){ return commentMapper.list();}

    @Override
    public  int add(Comment comment){ return commentMapper.add(comment);}

    @Override
    public int update(Comment comment){ return commentMapper.update(comment);}

}

