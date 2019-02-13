package com.cyberapes.apes.core.mapper;

import java.util.List;

/**
 * 通用Mapper，配合ICoreService使用
 * @param <T>
 */
public interface ICoreMapper<T> {

    /**
     * 查询全部记录
     * @return
     */
    List<T> selectAll();

    /**
     * 根据id查询单条记录
     * @param key
     * @return
     */
    T selectByPrimaryKey(Object key);

    /**
     * 根据条件查询数据集
     * @param record
     * @return
     */
    List<T> selectBy(T record);

    /**
     * 根据条件查询记录数量
     * @param record
     * @return
     */
    int selectCountBy(T record);

    /**
     * 插入单条数据
     * @param record
     * @return
     */
    int insert(T record);

    /**
     * 批量插入数据
     * @param lst
     * @return
     */
    int batchInsert(List<T> lst);

    /**
     * 根据主键更新全部字段
     * @param record
     * @return
     */
    int updateByPrimary(T record);

    /**
     * 根据主键更新部分字段
     * @param record
     * @return
     */
    int updateSelectiveByPrimaryKey(T record);

    /**
     * 根据主键删除
     * @param record
     * @return
     */
    int deleteByPrimaryKey(T record);

    /**
     * 根据条件删除
     * @param record
     * @return
     */
    int deleteBy(T record);
}
