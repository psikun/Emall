package com.emall.controller;

import com.emall.common.Result;
import com.emall.entity.Address;
import com.emall.entity.Attribute;
import com.emall.service.AddressService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author GJ
 * @Description AddressController
 * @date 2022/09/02/ 12:57
 */
@Slf4j
@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;

    @ApiOperation("通过地址id获取地址")
    @GetMapping("/{addressId}")
    public Result<Address> getAddressById(@PathVariable("addressId") int addressId){
        Address address = addressService.getAddressById(addressId);
        if (address == null) {
            return Result.failed();
        }
        return Result.success(address, "成功获取地址");
    }
    @ApiOperation("显示所有地址信息")
    @GetMapping("/list")
    public Result<List<Address>> list(){
        List<Address> list = addressService.list();
        if(list==null){
            return Result.failed();
        }
        return Result.success(list,"成功");

    }
    @ApiOperation("添加地址信息")
    @PostMapping("/add")
    public Result<String> add(@RequestBody Address address) {
        if (addressService.add(address) != 0) {
            return Result.success("地址添加成功");
        }
        return Result.failed("添加失败");
    }
    @ApiOperation("修改地址信息")
    @PostMapping("/update")
    public Result<String > update(@RequestBody Address address){
        if (addressService.update(address) != 0){
            return Result.success("地址修改成功");
        }
        return Result.failed("地址修改失败");
    }
    @ApiOperation("删除地址信息")
    @DeleteMapping("/delete")
    public Result<String> deleteById(int id){
        int delete = addressService.delete(id);
        if(delete == 1){
            return Result.success(null,"删除成功");

        }
        return Result.failed("删除失败");
    }
}
