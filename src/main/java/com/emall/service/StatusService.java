package com.emall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.emall.entity.Status;

import java.util.List;

/**
 * @author Lison
 * @Description StatusService
 * @date 2022/09/02/ 14:14
 */
public interface StatusService extends IService<Status> {
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

    /**
     * Delete int.
     *
     * @param id the id
     * @return the int
     */
    int delete(int id);
}
