package com.manager.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ManagerJDBCDAO implements  ManagerDAO_interface {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/MonsterStrike?user=root&password=123456";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    private static final String INSERT_SQL = "INSERT INTO MANAGER (MG_email, MG_password, MG_name, MG_title, Line_id, Line_url) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String UPDATE_SQL= "UPDATE MANAGER SET MG_name = ?, MG_title = ?, Line_id = ?, Line_url = ? WHERE MG_no = ?";
    private static final String DELETE_SQL = "DELETE FROM MANAGER WHERE MG_no = ?";
    private static final String pswUpdate_SQL = "UPDATE MANAGER SET MG_password = ? WHERE MG_no = ?";
    private static final String OneManager_no = "SELECT * FROM manager WHERE MG_no = ?";
    private static final String OneManager_email = "SELECT * FROM monsterstrike.view_manager WHERE MG_email = ?";
    private static final String OneManager_name = "SELECT * FROM monsterstrike.view_manager WHERE MG_name = ?";
    private static final String OneManager_title = "SELECT * FROM monsterstrike.view_manager WHERE PM_name = ?";
    private static final String AllManager = "SELECT * FROM monsterstrike.view_manager";

    static {
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Couldn't load database driver."
                    + e.getMessage());
        }
    }

    @Override
    public String insert(ManagerVO managerVO) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String gKey = "";

        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            String[] key = {"MG_no"};
            pstmt = con.prepareStatement(INSERT_SQL, key);
            pstmt.setString(1, managerVO.getMG_email());
            pstmt.setString(2, managerVO.getMG_password());
            pstmt.setString(3, managerVO.getMG_name());
            pstmt.setString(4, managerVO.getMG_title());
            pstmt.setString(5, managerVO.getLine_id());
            pstmt.setString(6, managerVO.getLine_url());

            pstmt.executeUpdate();

            rs = pstmt.getGeneratedKeys();

            if (rs.next()) {
                gKey = rs.getString(1);
            }

        } catch (SQLException e) {
            throw new RuntimeException("A database error occured. "
                    + e.getMessage());
        } finally {
            if(pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return gKey;
    }

    @Override
    public void update(ManagerVO managerVO) {
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = con.prepareStatement(UPDATE_SQL);
            pstmt.setString(1, managerVO.getMG_name());
            pstmt.setString(2, managerVO.getMG_title());
            pstmt.setString(3, managerVO.getLine_id());
            pstmt.setString(4, managerVO.getLine_url());
            pstmt.setString(5, managerVO.getMG_no());

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("A database error occured. "
                    + e.getMessage());
        } finally {
            if(pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public void delete(String MG_no) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = con.prepareStatement(DELETE_SQL);
            pstmt.setString(1,MG_no);
            pstmt.executeUpdate();

        } catch (SQLException se) { // Handle any SQL errors
            throw new RuntimeException("A database error occured. "
                    + se.getMessage());
            // Clean up JDBC resources
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException se) {
                    se.printStackTrace(System.err);
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (Exception e) {
                    e.printStackTrace(System.err);
                }
            }
        }
    }

    @Override
    public void pswUpdate(ManagerVO managerVO) {
        Connection con = null;
        PreparedStatement pstmt = null;
        try {

            con = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = con.prepareStatement(pswUpdate_SQL);

            pstmt.setString(1,managerVO.getMG_password());
            pstmt.setString(2,managerVO.getMG_no());
            pstmt.executeUpdate();

            // Handle any driver errors
        } catch (SQLException e) {
            throw new RuntimeException("A database error occured. "
                    + e.getMessage());
        } finally {
            if(pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public ManagerVO findByPrimaryKey(String MG_no) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ManagerVO vo = new ManagerVO();

        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = con.prepareStatement(OneManager_no);
            pstmt.setString(1, MG_no);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                vo.setMG_no(rs.getString("MG_no"));
                vo.setMG_email(rs.getString("MG_email"));
                vo.setMG_password(rs.getString("MG_password"));
                vo.setMG_name(rs.getString("MG_name"));
                vo.setMG_title(rs.getString("MG_title"));
                vo.setMG_createtime(rs.getTimestamp("MG_createtime"));
                vo.setMG_updatetime(rs.getTimestamp("MG_updatetime"));

            }
        } catch (SQLException e) {
            throw new RuntimeException("A database error occured. "
                    + e.getMessage());
        } finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return vo;
    }

    @Override
    public ManagerVO findByAccount(String MG_email) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ManagerVO vo = new ManagerVO();

        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = con.prepareStatement(OneManager_email);
            pstmt.setString(1, MG_email);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                vo.setMG_no(rs.getString("MG_no"));
                vo.setMG_email(rs.getString("MG_email"));
                vo.setMG_password(rs.getString("MG_password"));
                vo.setMG_name(rs.getString("MG_name"));
                vo.setPM_name(rs.getString("PM_name"));
                vo.setMG_createtime(rs.getTimestamp("MG_createtime"));
                vo.setMG_updatetime(rs.getTimestamp("MG_updatetime"));

            }
        } catch (SQLException e) {
            throw new RuntimeException("A database error occured. "
                    + e.getMessage());
        } finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return vo;
    }

    @Override
    public ManagerVO findByName(String MG_name) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ManagerVO vo = new ManagerVO();

        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = con.prepareStatement(OneManager_name);
            pstmt.setString(1, MG_name);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                vo.setMG_no(rs.getString("MG_no"));
                vo.setMG_email(rs.getString("MG_email"));
                vo.setMG_password(rs.getString("MG_password"));
                vo.setMG_name(rs.getString("MG_name"));
                vo.setPM_name(rs.getString("PM_name"));
                vo.setMG_createtime(rs.getTimestamp("MG_createtime"));
                vo.setMG_updatetime(rs.getTimestamp("MG_updatetime"));

            }
        } catch (SQLException e) {
            throw new RuntimeException("A database error occured. "
                    + e.getMessage());
        } finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return vo;
    }

    @Override
    public ManagerVO findByTitle(String MG_title) {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ManagerVO vo = new ManagerVO();

        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = con.prepareStatement(OneManager_title);
            pstmt.setString(1, MG_title);
            rs = pstmt.executeQuery();
            if(rs.next()) {
                vo.setMG_no(rs.getString("MG_no"));
                vo.setMG_email(rs.getString("MG_email"));
                vo.setMG_password(rs.getString("MG_password"));
                vo.setMG_name(rs.getString("MG_name"));
                vo.setPM_name(rs.getString("PM_name"));
                vo.setMG_createtime(rs.getTimestamp("MG_createtime"));
                vo.setMG_updatetime(rs.getTimestamp("MG_updatetime"));

            }
        } catch (SQLException e) {
            throw new RuntimeException("A database error occured. "
                    + e.getMessage());
        } finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return vo;
    }

    @Override
    public List<ManagerVO> getAllManager() {
        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ManagerVO vo = null;
        List<ManagerVO> list = new ArrayList<ManagerVO>();
        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            pstmt = con.prepareStatement(AllManager);
            rs = pstmt.executeQuery();
            while(rs.next()) {
                vo = new ManagerVO();
                vo.setMG_no(rs.getString("MG_no"));
                vo.setMG_email(rs.getString("MG_email"));
                vo.setMG_password(rs.getString("MG_password"));
                vo.setMG_name(rs.getString("MG_name"));
                vo.setPM_name(rs.getString("PM_name"));
                vo.setMG_createtime(rs.getTimestamp("MG_createtime"));
                vo.setMG_updatetime(rs.getTimestamp("MG_updatetime"));

                list.add(vo);
            }
        } catch (SQLException e) {
            throw new RuntimeException("A database error occured. "
                    + e.getMessage());
        } finally {
            if(rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if(con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
}
