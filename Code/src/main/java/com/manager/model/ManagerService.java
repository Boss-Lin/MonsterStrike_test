package com.manager.model;

import java.sql.Timestamp;
import java.util.List;

public class ManagerService {
    private ManagerDAO_interface dao;

    public ManagerService() {
        dao = new ManagerJDBCDAO();
    }

    //新增管理員
    public ManagerVO addManager(String MG_email, String MG_password, String MG_name, String MG_title, String Line_id, String Line_url, Timestamp MG_createtime, Timestamp MG_updatetime) {

        ManagerVO managerVO = new ManagerVO();

//        managerVO.setMG_no(MG_no);
        managerVO.setMG_email(MG_email);
        managerVO.setMG_password(MG_password);
        managerVO.setMG_name(MG_name);
        managerVO.setMG_title(MG_title);
        managerVO.setLine_id(Line_id);
        managerVO.setLine_url(Line_url);
        managerVO.setMG_createtime(MG_createtime);
        managerVO.setMG_updatetime(MG_updatetime);

        dao.insert(managerVO);

        return managerVO;
    }

    //更新管理員
    public ManagerVO updateManager(String MG_no, String MG_email, String MG_password, String MG_name, String MG_title, String Line_id, String Line_url, Timestamp MG_updatetime) {

        ManagerVO managerVO = new ManagerVO();

        managerVO.setMG_no(MG_no);
        managerVO.setMG_email(MG_email);
        managerVO.setMG_password(MG_password);
        managerVO.setMG_name(MG_name);
        managerVO.setMG_title(MG_title);
        managerVO.setMG_updatetime(MG_updatetime);

        dao.update(managerVO);

        return managerVO;
    }

    //刪除管理員
    public void deleteManager(String MG_no) {
        dao.delete(MG_no);
    }

    //更新管理員密碼
    public ManagerVO updateManagerPassword(String MG_password, String MG_no) {

        ManagerVO managerVO = new ManagerVO();

        managerVO.setMG_password(MG_password);
        managerVO.setMG_no(MG_no);

        dao.pswUpdate(managerVO);

        return managerVO;
    }

    //顯示1筆管理員資料
    public ManagerVO getOneManager(String MG_no) {
        return dao.findByPrimaryKey(MG_no);
    }

    public ManagerVO getOneAccount(String MG_email) {
        return dao.findByAccount(MG_email);
    }

    public ManagerVO getOneName(String MG_name) {
        return dao.findByName(MG_name);
    }

    public ManagerVO getOneTitle(String MG_title) {
        return dao.findByTitle(MG_title);
    }

    //顯示全部管理員資料
    public List<ManagerVO> getAllManager() {

        return dao.getAllManager();
    }
}
