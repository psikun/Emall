package com.emall.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emall.entity.Size;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

@Mapper
public interface SizeMapper extends BaseMapper<SizeMapper> {

    Size getSizeById(@PathVariable("id") int id);

}
