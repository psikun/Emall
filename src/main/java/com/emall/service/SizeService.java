package com.emall.service;


import com.emall.entity.Attribute;
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


    /**
     * 获取List集合
     * @return
     */
    List<Size> list();

    /**
     *
     * @param size
     * @return size
     */
    int add(Size size);

    int update(Size size);

    int delete(int id);


}
