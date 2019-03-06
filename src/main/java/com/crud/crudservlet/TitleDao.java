package com.crud.crudservlet;

import java.util.*;
import java.sql.*;

public class TitleDao {
    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://10.200.64.182:3306/testdb", "jacplus", "jac567");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public static int save(Title t) {
        int status = 0;
        try {
            Connection con = TitleDao.getConnection();
            PreparedStatement ps = con.prepareStatement("insert into title(isbn,title,author,type) values (?,?,?,?)");
            ps.setString(1, t.getIsbn());
            ps.setString(2, t.getTitle());
            ps.setString(3, t.getAuthor());
            ps.setString(4, t.getType());

            status = ps.executeUpdate();

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return status;
    }

    public static int update(Title t) {
        int status = 0;
        try {
            Connection con = TitleDao.getConnection();
            PreparedStatement ps = con.prepareStatement("update title set title=?,author=?,type=? where isbn=?");
            ps.setString(1, t.getTitle());
            ps.setString(2, t.getAuthor());
            ps.setString(3, t.getType());
            ps.setString(4, t.getIsbn());


            status = ps.executeUpdate();

            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return status;
    }

    public static int delete(String isbn) {
        int status = 0;
        try {
            Connection con = TitleDao.getConnection();
            PreparedStatement ps = con.prepareStatement("delete from title where isbn=?");
            ps.setString(1, isbn);
            status = ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return status;
    }

    public static Title gettitleByIsbn(String isbn) {
        Title t = new Title();

        try {
            Connection con = TitleDao.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from title where isbn=?");
            ps.setString(1, isbn);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                t.setIsbn(rs.getString(1));
                t.setTitle(rs.getString(2));
                t.setAuthor(rs.getString(3));
                t.setType(rs.getString(4));
            }
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return t;
    }

    public static List<Title> getAllTitles() {
        List<Title> list = new ArrayList<Title>();

        try {
            Connection con = TitleDao.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from title");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Title t = new Title();
                t.setIsbn(rs.getString(1));
                t.setTitle(rs.getString(2));
                t.setAuthor(rs.getString(3));
                t.setType(rs.getString(4));
                list.add(t);
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}
