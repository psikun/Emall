package com.emall.service;


import com.emall.entity.Size;

import java.util.List;

public interface SizeService {

    /**
     * 根据id获取尺寸
     *
     * @param
     * @return Size
     */
    Size getSizeById(int id);



    List<Size> list();

    int add(Size size);
}
