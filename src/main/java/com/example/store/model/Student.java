package com.example.store.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * (Student)实体类
 *
 * @author gjc
 * @since 2023-02-19 08:42:00
 */
@Data
public class Student implements Serializable {
    private static final long serialVersionUID = 390878505580816816L;
    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;
    /**
     * 学号
     */
    private String number;
    /**
     * 班级名称
     */
    private String className;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;

}