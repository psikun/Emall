package com.emall.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emall.entity.Size;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface SizeMapper extends BaseMapper<Size>{

    Size getSizeById(@PathVariable("id") int id);

    /**
     * List list
     * @return list
     */
    List<Size> list();

    /**
     * Size size
     * @return size
     */
    int add(Size size);

    /**
     *
     * @param size
     * @return size
     */



}
