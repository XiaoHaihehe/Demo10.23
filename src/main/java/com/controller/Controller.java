package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;
import com.entity.Page;
import com.service.TeacherService;
import com.service.TeacherServiceImpl;
import com.util.AjaxUtil;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@org.springframework.stereotype.Controller
public class Controller implements Action{
    @Resource(name="TeacherServiceImpl")
    TeacherService ts;
    @RequestMapping(value="SelectAll.do")
    public String selectAll(HttpServletRequest request, HttpServletResponse response, Integer page,Integer row) {
        Page p = new Page();
        page=page<1?1:page;
        row=row<1?1:row;
        p.setPage(page);
        p.setRow(row);
        int maxRow = ts.findMaxRow();
        int maxPage = 1;
        if(maxRow!=0){
            maxPage=maxRow%row==0?maxRow/row:maxRow/row+1;
        }
        p.setMaxPage(maxPage);
        p.setPageList(ts.selectAll(p));
        String json= JSONObject.toJSONString(p);
        AjaxUtil.doJson(response, json);
        return null;
    }
    @RequestMapping(value="findMaxPage.do")
    public String findMaxPage(HttpServletRequest request, HttpServletResponse response,Integer page,Integer row) {
        int maxRow = ts.findMaxRow();
        int maxPage = 1;
        if(maxRow!=0){
            maxPage=maxRow%row==0?maxRow/row:maxRow/row+1;
        }
        String json= JSONObject.toJSONString(maxPage);
        AjaxUtil.doJson(response, json);
        return null;
    }
}
