package com.emall.controller;

import com.emall.common.Result;

import com.emall.entity.Status;
import com.emall.service.StatusService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Lison
 * @Description StatusController
 * @date 2022/09/02/ 14:29
 */
@Slf4j
@RestController
@RequestMapping("/status")
public class StatusController {
    @Autowired
    StatusService statusService;

    @ApiOperation("通过id获取订单状态信息")
    @GetMapping("/{statusId}")
    public Result<Status> getStatusById(int statusId) {
        Status status = statusService.getStatusById(statusId);
        if (status == null) {
            return Result.failed();
        }
        return Result.success(status, "成功了");

    }

    @ApiOperation("展示订单状态表的所有信息")
    @GetMapping("/list")
    public Result<List<Status>> list() {
        List<Status> list = statusService.list();
        if (list == null) {
            return Result.failed();
        }
        return Result.success(list, "成功了");
    }

    @ApiOperation("增加订单状态信息")
    @PostMapping("/add")
    public Result<String> add(@RequestBody Status status) {
        if (statusService.add(status) != 0) {
            return Result.success("添加成功");
        }
        return Result.failed("添加失败");
    }
    @ApiOperation("更新订单状态信息")
    @PostMapping("/update")
    public Result<String> update(@RequestBody  Status status){
        if(statusService.update(status)!=0){
            return Result.success("更新成功");

        }
        return  Result.failed("更新失败");
    }
    @ApiOperation("根据id删除订单状态")
    @DeleteMapping("/delete")
    public Result<String> deleteById(int id){
        int delete = statusService.delete(id);
        if(delete == 1){
            return Result.success(null,"删除成功");
        }
        return Result.failed("删除失败");
    }
}
