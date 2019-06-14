package com.bdqn.service.impl;

import com.bdqn.dao.IStudentDao;
import com.bdqn.po.Student;
import com.bdqn.service.IStudentService;

import java.util.List;

/**
 * @author willian
 * @create 2019/5/21-16:37
 */
public class StudentServiceImpl implements IStudentService {
    private IStudentDao studentDao;

    public void setStudentDao(IStudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public void save(Student stu) throws Exception{
        studentDao.insert(stu);
    }

    @Override
    public Student getByid(Integer sid) {
        return null;
    }

    @Override
    public List<Student> list() {
        return studentDao.getall();
    }

    @Override
    public void update(Student stu) {
    }

    @Override
    public void remove(Student stu) {

    }
}
