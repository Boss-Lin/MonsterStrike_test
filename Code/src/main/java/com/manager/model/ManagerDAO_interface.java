package com.manager.model;


import java.util.List;

public interface ManagerDAO_interface {
    /**
     * 新增
     * 更新
     * 刪除
     * 更新密碼
     * 搜尋1筆管理員
     * 搜尋1筆管理員(用email)
     * 顯示全部管理員
     * 顯示全部使用者
     */

    public String insert(ManagerVO ManagerVO);
    public void update(ManagerVO ManagerVO);
    public void delete(String MG_no);
    public void pswUpdate(ManagerVO managerVO);
    public ManagerVO findByPrimaryKey(String MG_no);
    public ManagerVO findByAccount(String MG_email);
    public ManagerVO findByName(String MG_name);
    public ManagerVO findByTitle(String PM_name);
    public List<ManagerVO> getAllManager();
}