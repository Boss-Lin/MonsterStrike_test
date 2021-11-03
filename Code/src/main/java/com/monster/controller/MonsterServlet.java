package com.monster.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MonsterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doPost(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html; charset=UTF-8");
        String action = req.getParameter("action");


        //新增
        //更新
        //刪除
        //用名稱搜尋角色(M_name)
        //用屬性搜尋角色(M_tybe)
        //用擊種搜尋角色(M_hit)
        //用戰型搜尋角色(M_combatType)
        //用稀有度搜尋角色(M_rarity)
        //用種族搜尋角色(M_race)
        //用取得方式搜尋角色(M_get)
        //用卡池搜尋角色(M_pool)
        //顯示全部角色


    }
}
