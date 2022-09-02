package com.emall.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.emall.entity.Status;
import com.emall.mapper.SizeMapper;
import com.emall.mapper.StatusMapper;
import com.emall.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lison
 * @Description StatusServiceImpl
 * @date 2022/09/02/ 14:15
 */
@Service
public class StatusServiceImpl extends ServiceImpl<StatusMapper,Status>  implements StatusService {
    @Autowired
    StatusMapper statusMapper;

    @Override
    public Status getStatusById(int id) {
        return statusMapper.getStatusById(id);
    }

    @Override
    public List<Status> list() {
        return statusMapper.list();
    }

    @Override
    public int add(Status status) {
        return statusMapper.add(status);
    }

    @Override
    public int update(Status status) {
        return statusMapper.update(status);
    }
    @Override
    public int delete(int id){
        return statusMapper.deleteById(id);
    }



}
