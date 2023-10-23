package com.service;

import com.entity.Page;
import com.entity.Teacher;
import com.map.TeacherMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service("TeacherServiceImpl")
@Transactional
public class TeacherServiceImpl implements TeacherService{
    @Resource(name="TeacherMapper")
    TeacherMapper tm;
    public List<Teacher> selectAll(Page p) {
        return tm.selectAll(p) ;
    }

    public Integer findMaxRow() {
        return tm.findAllRow();
    }
}
