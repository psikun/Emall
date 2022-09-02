package com.emall.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.emall.entity.Category;
import com.emall.entity.Status;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Lisonn
 * @Description StatusMapper
 * @date 2022/09/02/ 13:31
 */
@Mapper
public interface StatusMapper extends BaseMapper<Status> {
    /**
     * 根据id获取分类
     *
     * @param id id
     * @return Status
     */
    Status getStatusById(int id);

    /**
     * List list.
     *
     * @return the list
     */
    List<Status> list();


    /**
     * Add int.
     *
     * @param status the status
     * @return the int
     */
    int add(Status status);


    /**
     * Update int.
     *
     * @param status the status
     * @return the int
     */
    int update(Status status);
}
