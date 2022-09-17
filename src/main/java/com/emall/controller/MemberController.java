package com.emall.controller;

import com.emall.common.Result;
import com.emall.entity.Member;
import com.emall.service.MemberService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/Member")
public class MemberController {
    @Autowired
    MemberService memberService;

    @ApiOperation("通过会员id获取会员信息")
    @GetMapping("/{memberId}")
    public Result<Member> getMemberById(int memberId) {
        Member member = memberService.getMemberById(memberId);
        if (member == null) {
            return Result.failed();
        }
        return Result.success(member, "成功了");

    }

    @ApiOperation("展示会员表的所有信息")
    @GetMapping("/list")
    public Result<List<Member>> list() {
        List<Member> list = memberService.list();
        if (list == null)
            return Result.failed();
        else
            return Result.success(list, "成功了");
    }

    @ApiOperation("增加会员信息")
    @PostMapping("/add")
    public Result<String> add(@RequestBody Member member) {
        if (memberService.add(member) != 0) {
            return Result.success("添加成功");
        }
        return Result.failed("添加失败");
    }

    @ApiOperation("更新会员信息")
    @PostMapping("/update")
    public Result<String> update(@RequestBody Member member) {
        if (memberService.update(member) != 0) {
            return Result.success("更新成功");

        }
        return Result.failed("更新失败");
    }
    @ApiOperation("根据会员id删除会员")
    @DeleteMapping("/delete")
    public Result<String> deleteById(int id){
        int delete = memberService.delete(id);
        if(delete == 1){
            return Result.success(null,"删除成功");
        }
        return Result.failed("删除失败");
    }

}
