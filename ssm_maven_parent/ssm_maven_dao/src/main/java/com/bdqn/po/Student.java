package com.bdqn.po;

import java.io.Serializable;
import java.sql.Date;

/**
 * 学生对象-对应数据库中的tb_student表
 * 规约:对象的属性名和表的字段名一致对应
 *
 * @author Administrator
 */
public class Student implements Serializable {
    private Integer sid;
    private String name;
    private Integer age;
    private String gender;
    private Date birthday;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Student(Integer sid, String name, Integer age, String gender,
                   Date birthday) {
        super();
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
    }



    public Student() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "学生信息[sid=" + sid + ", name=" + name + ", age=" + age
                + ", gender=" + gender + ", birthday=" + birthday + "]";
    }

}
