package com.bdqn.controller;

import com.bdqn.po.Student;
import com.bdqn.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import java.io.IOException;
import java.util.List;

/**
 * @author willian
 * @create 2019/5/24-17:07
 */
@Controller
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @RequestMapping("/list.bdqn")
    //学生列表
    public String list(Model model) throws ServletException, IOException {
        //调用Service
        List<Student> studentList = studentService.list();
        //存储集合
        model.addAttribute("studentlist",studentList);
        return "forward:index.jsp";
    }

    //新增处理
    @RequestMapping("/add.bdqn")
    public String add(Student student){
        //保存
        try {
            studentService.save(student);
            //跳查询页
            return "/list.bdqn";
        } catch (Exception e) {
            e.printStackTrace();
            return "forward:error.jsp";
        }
    }

}
