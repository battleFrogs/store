package com.example.store.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.store.mapper.StudentMapper;
import com.example.store.model.Student;
import com.example.store.service.StudentService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    /**
     * 设置学生信息
     *
     * @param student 学生
     * @return 结果
     */
    @PostMapping("/save")
    public String setStudent(@RequestBody Student student) {
        studentService.save(student);
        return "success";
    }

    /**
     * 查询单个学生信息
     *
     * @param id 主键id
     * @return 单个学生信息
     */
    @GetMapping("/getOne")
    public Student getOne(@RequestParam Long id) {
        return studentService.getById(id);
    }

    /**
     * 批量查询学生信息
     *
     * @param pageIndex 当前页
     * @param pageSize  每页条数
     * @return 单个学生信息
     */
    @PostMapping("/getPageList")
    public Page<Student> getPageList(Integer pageIndex, Integer pageSize, @RequestBody Student student) {
        return studentService.page(new Page<>(pageIndex, pageSize), new QueryWrapper<>(student));
    }


    /**
     * 删除单个学生信息
     *
     * @param id 主键id
     * @return 结果
     */
    @GetMapping("/deleteById")
    public String deleteById(@RequestParam Long id) {
        studentService.removeById(id);
        return "success";
    }


    /**
     * 修改学生信息
     *
     * @param student 学生信息
     * @return 结果
     */
    @PostMapping("/updateStudent")
    public String updateStudent(Integer id, @RequestBody Student student) {
        Student studentParam = new Student();
        studentParam.setId(id);
        UpdateWrapper<Student> studentUpdateWrapper = new UpdateWrapper<>(studentParam);
        studentService.update(student, studentUpdateWrapper);
        return "success";
    }

}
