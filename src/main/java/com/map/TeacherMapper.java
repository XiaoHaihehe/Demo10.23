package com.map;

import com.entity.Page;
import com.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("TeacherMapper")
public interface TeacherMapper {
    public List<Teacher> selectAll(Page p);
    public Integer findAllRow();
}
