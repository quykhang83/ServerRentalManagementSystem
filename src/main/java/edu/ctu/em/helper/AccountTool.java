/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ctu.em.helper;

import edu.ctu.em.model.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author quykh
 */
public class AccountTool {
    public Account checkLogin(String username, String password) throws Exception{
        String sql = "select * from account where username = ? and password = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            psmt.setString(1, username);
            psmt.setString(2, password);
            
            try(ResultSet rs = psmt.executeQuery();){
                if(rs.next()){
                    Account user = new Account();
                    user.setIdAcc(rs.getInt("idAccount"));
                    user.setUsername(username);
                    user.setPassword(password);
                    user.setRole(rs.getInt("Role"));
                    return user;
                }
            }
        }
        return null;
    }
    

    public boolean update(Account acc) throws Exception{
        String sql = "update account set password = ? where idAccount = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
            psmt.setString(1, acc.getPassword());
            psmt.setInt(2, acc.getIdAcc());
            
            return psmt.executeUpdate() > 0;
        }
    }
}
