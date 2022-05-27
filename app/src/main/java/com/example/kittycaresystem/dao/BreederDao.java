package com.example.kittycaresystem.dao;

import com.example.kittycaresystem.utils.JDBCUtils;
import com.example.kittycaresystem.entity.Breeder;

import java.sql.Connection;
import java.sql.PreparedStatement;;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BreederDao {
    public boolean login(String bid, String password){

        String sql = "select * from Breeder where Breeder_ID = ? and Password = ?";

        Connection con = JDBCUtils.getConn();

        try{
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setString(1,bid);
            pst.setString(2,password);

            if (pst.executeQuery().next()){
                return true;
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally{
            JDBCUtils.close(con);
        }
        return false;
    }
    public boolean register(Breeder breeder){
        String sql = "insert into Breeder(Breeder_ID,Password,B_Name) values(?,?,?)";

        Connection con = JDBCUtils.getConn();

        try{
            PreparedStatement pst=con.prepareStatement(sql);

            pst.setString(1,breeder.getBid());
            pst.setString(2,breeder.getPassword());
            pst.setString(3, breeder.getBid());

            int value = pst.executeUpdate();

            if (value>0){
                return true;
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(con);
        }
        return false;
    }
    public Breeder findBreeder(String bid){
        String sql = "select * from Breeder where Breeder_ID = ?";

        Connection con = JDBCUtils.getConn();
        Breeder breeder = null;
        try{
            PreparedStatement pst=con.prepareStatement(sql);

            pst.setString(1,bid);

            ResultSet rs = pst.executeQuery();

            while(rs.next()){
                String biddb = rs.getString(0);
                String passworddb = rs.getString(1);
                String bnamedb = rs.getString(2);
                breeder = new Breeder(biddb,passworddb,passworddb);
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(con);
        }
        return breeder;
    }
}
