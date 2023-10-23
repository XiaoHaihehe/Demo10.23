package com.service;

import com.entity.Page;
import com.entity.Teacher;

import java.util.List;

public interface TeacherService {
    public List<Teacher> selectAll(Page p);
    public Integer findMaxRow();
}
