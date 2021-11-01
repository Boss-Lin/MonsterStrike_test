package com.manager.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ManagerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doPost(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html; charset=UTF-8");
        String action = req.getParameter("action");

        //新增管理者
        if ("insert".equals(action)) {

        }

        if ("update".equals(action)) {

        }

        if ("pswUpdate".equals(action)) {

        }

        if ("getAll".equals(action)) {

        }
    }
}
