/*
 * Copyright &copy; <a href="http://www.zsteel.cc">zsteel</a> All rights reserved.
 */

package com.bdfint.backend.framework.common;


import com.github.pagehelper.PageInfo;
import tk.mybatis.mapper.entity.Condition;

import java.util.List;

/**
 * service基类
 *
 * @author lufengc
 * @date 2016-01-15 09:56:22
 */
public interface BaseService<T> {

    /**
     * 数据插入或更新操作
     * 由业务类实现
     *
     * @param object T
     */
    String save(T object) throws Exception;

    /**
     * 新增entity
     *
     * @param object T
     * @return 主键ID
     */
    int insert(T object) throws Exception;

    /**
     * 修改entity
     *
     * @param object T
     */
    void update(T object) throws Exception;

    /**
     * 删除entity
     *
     * @param ids 删除的ID
     * @return 删除数量
     */
    int delete(String ids) throws Exception;

    /**
     * 获取对象
     *
     * @param id 主键ID
     * @return T
     */
    T get(String id) throws Exception;

    /**
     * 获取列表
     *
     * @param object 要查询的对象
     * @return List<T>
     */
    List<T> getList(T object) throws Exception;


    /**
     * @param object 要查询的对象
     * @return PageInfo<T>
     */
    PageInfo<T> getPage(T object, Condition condition) throws Exception;
}
