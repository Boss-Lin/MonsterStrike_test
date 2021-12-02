package com.manager.model;
import java.io.*;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {

        ManagerJDBCDAO dao = new ManagerJDBCDAO();

        /**新增*/
//        ManagerVO ManagerVO1 = new ManagerVO();
//        ManagerVO1.setMG_email("3333@gmail.com");
//        ManagerVO1.setMG_password("3");
//        ManagerVO1.setMG_name("3魚");
//        ManagerVO1.setMG_title("PM004");
//        ManagerVO1.setLine_id("");
//        ManagerVO1.setLine_url("");
//        dao.insert(ManagerVO1);
//        System.out.println("成功新增");

        /**更新(成功)*/
//        ManagerVO ManagerVO2 = new ManagerVO();
//        ManagerVO2.setMG_name("0意翔");
//        ManagerVO2.setMG_title("PM005");
//        ManagerVO2.setLine_id("");
//        ManagerVO2.setLine_url("");
//        ManagerVO2.setMG_no("MG001");
//        dao.update(ManagerVO2);
//        System.out.println("成功更新");
//		System.out.println("---------------------");

        /**刪除(成功)*/
//        dao.delete("MG003");
//		System.out.println("成功刪除");


        /**更改密碼(成功)*/
//		ManagerVO managerVO3 = new ManagerVO();
//		managerVO3.setMG_password("1234567");
//        managerVO3.setMG_no("MG002");
//		dao.pswUpdate(managerVO3);
//		System.out.println("成功更新密碼");

        /**查詢(成功)*/
//		ManagerVO ManagerVO3 = dao.findByPrimaryKey("MG001");
//		System.out.print(ManagerVO3.getMG_no() + ",");
//		System.out.print(ManagerVO3.getMG_email() + ",");
//		System.out.print(ManagerVO3.getMG_name() + ",");
//		System.out.print(ManagerVO3.getMG_title() + ",");
//		System.out.print(ManagerVO3.getMG_createtime() + ",");
//		System.out.println(ManagerVO3.getMG_updatetime() + ",");
//		System.out.println("成功查詢一筆");
//		System.out.println("---------------------");

        /**查詢-email(成功)*/
//        ManagerVO ManagerVO4 = dao.findByAccount("123456@gmail.com");
//        System.out.print(ManagerVO4.getMG_no() + ",");
//        System.out.print(ManagerVO4.getMG_email() + ",");
//        System.out.print(ManagerVO4.getMG_name() + ",");
//        System.out.print(ManagerVO4.getPM_name() + ",");
//        System.out.print(ManagerVO4.getMG_createtime() + ",");
//        System.out.print(ManagerVO4.getMG_updatetime() + ",");
//
//        System.out.println("成功使用帳號查詢");
//		System.out.println("---------------------");

        /**查詢-nmame(成功)*/
//        ManagerVO ManagerVO5 = dao.findByName("0意翔");
//        System.out.print(ManagerVO5.getMG_no() + ",");
//        System.out.print(ManagerVO5.getMG_email() + ",");
//        System.out.print(ManagerVO5.getMG_name() + ",");
//        System.out.print(ManagerVO5.getPM_name() + ",");
//        System.out.print(ManagerVO5.getMG_createtime() + ",");
//        System.out.println(ManagerVO5.getMG_updatetime() + ",");
//
//        System.out.println("成功使用姓名查詢");
//		System.out.println("---------------------");

        /**查詢-title(成功)*/
//        ManagerVO ManagerVO6 = dao.findByTitle("一般使用者");
//        System.out.print(ManagerVO6.getMG_no() + ",");
//        System.out.print(ManagerVO6.getMG_email() + ",");
//        System.out.print(ManagerVO6.getMG_name() + ",");
//        System.out.print(ManagerVO6.getPM_name() + ",");
//        System.out.print(ManagerVO6.getMG_createtime() + ",");
//        System.out.print(ManagerVO6.getMG_updatetime() + ",");
//
//        System.out.println("成功使用職別查詢");
//		System.out.println("---------------------");

        /**查全部(成功)*/
		List<ManagerVO> list = dao.getAllManager();
		for (ManagerVO aManager : list) {
			System.out.print(aManager.getMG_no() + ",");
			System.out.print(aManager.getMG_email() + ",");
			System.out.print(aManager.getMG_password() + ",");
			System.out.print(aManager.getMG_name() + ",");
			System.out.print(aManager.getPM_name() + ",");
			System.out.print(aManager.getMG_createtime() + ",");
			System.out.print(aManager.getMG_updatetime());
			System.out.println("");

			System.out.println("成功查詢全部");
			System.out.println("---------------------");
		}

    }
}