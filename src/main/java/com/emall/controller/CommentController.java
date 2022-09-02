package com.emall.controller;

import com.emall.common.Result;
import com.emall.entity.Comment;
import com.emall.service.CommentService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author GJ
 * @Description CommentController
 * @date 2022/09/02/ 16:03
 */
@Slf4j
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @ApiOperation("通过id查看评论")
    @GetMapping("/{commentId}")
    public Result<Comment> getCommentById(int commentId) {
       Comment comment = commentService.getCommentById(commentId);
        if (comment == null) {
            return Result.failed();
        }
        return Result.success(comment, "成功了");

    }
    @ApiOperation("展示评论表的所有信息")
    @GetMapping("/list")
    public Result<List<Comment>> list() {
        List<Comment> list = commentService.list();
        if (list == null) {
            return Result.failed();
        }
        return Result.success(list, "成功");
    }

    @ApiOperation("增加评论信息")
    @PostMapping("/add")
    public Result<String> add(@RequestBody Comment comment) {
        if (commentService.add(comment) != 0) {
            return Result.success("添加成功");
        }
        return Result.failed("添加失败");
    }
    @ApiOperation("更新评论信息")
    @PostMapping("/update")
    public Result<String> update(@RequestBody  Comment comment){
        if(commentService.update(comment)!=0){
            return Result.success("更新成功");

        }
        return  Result.failed("更新失败");
    }


}
