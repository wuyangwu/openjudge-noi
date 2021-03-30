package com.juc1205.day22;

/**
 * @author wuyang
 * @version 1.0
 * @date 2021/3/10 15:39
 *
 * DAO: data(base) access object
 * 将操作数据库中表的常用操作(CRUD)声明在此类中
 */
public class DAO<T> {
    //添加
    public void add(T t){

    }

    //删除
    public T delete(int id){

        return null;
    }

    public void update(int id, T t){

    }

    public T queryForInstance(int id){

        return null;
    }


}
