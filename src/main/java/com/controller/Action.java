package com.controller;

import com.entity.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
    public String selectAll(HttpServletRequest request, HttpServletResponse response, Integer page,Integer row);
    public String findMaxPage(HttpServletRequest request, HttpServletResponse response, Integer page,Integer row);
}
