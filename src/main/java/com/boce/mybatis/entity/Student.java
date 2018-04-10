package com.boce.mybatis.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yangxc
 * @version V1.0
 * @Description:
 * @date 2018/4/9
 * @Copyright: www.boce.cn
 */
@TableName("tb_student")
public class Student extends Model<Student> {

    @TableId(value="id",type= IdType.AUTO)
    private Integer id;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @TableField("stu_name")
    private String stuName;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @TableField("create_time")
    private Date createTime;

    public Student() {
    }

    public Student(String stuName, Date createTime) {
        this.stuName = stuName;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "id:"+this.id+" stuName:"+this.getStuName()+" create_time:"+this.getCreateTime();
    }
}
