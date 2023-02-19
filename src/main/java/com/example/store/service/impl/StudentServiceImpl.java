package com.example.store.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.store.model.Student;
import com.example.store.mapper.StudentMapper;
import com.example.store.service.StudentService;
import org.springframework.stereotype.Service;

/**
 * (Student)
 *
 * @author gjc
 * @since 2023-02-19 08:42:01
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student>
        implements StudentService {

}