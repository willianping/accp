package com.bdqn.service;

import com.bdqn.po.Student;

import java.util.List;

/**
 * @author willian
 * @create 2019/5/21-16:35
 */
public interface IStudentService {
    public void save(Student stu)  throws Exception;
    public Student getByid(Integer sid);
    public List<Student> list();
    public void update(Student stu)  throws Exception;
    public void remove(Student stu)  throws Exception;
}
