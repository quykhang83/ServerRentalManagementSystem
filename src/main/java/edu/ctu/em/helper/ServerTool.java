/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ctu.em.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import edu.ctu.em.model.Server;
import edu.ctu.em.model.SuggestedServer;

import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author quykhang
 */
public class ServerTool{
    public boolean insert(Server sv) throws Exception{
        String sql = "insert into server(idServer, nameServer, idOS, descriptionServer, benchMark, price, timeRemaining) values(?,?,?,?,?,?,?)";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            psmt.setInt(1, sv.getIdServer());
            psmt.setString(2, sv.getNameServer());
            psmt.setInt(3, sv.getIdOS());
            psmt.setString(4, sv.getDescriptionServer());
            psmt.setFloat(5, sv.getBenchMark());
            psmt.setFloat(6, sv.getPrice());
            psmt.setInt(7, sv.getTimeRemaining());
            
            return psmt.executeUpdate() > 0;
        }
    }
    
    public Server findById(int idServer) throws Exception{
        String sql = "select * from server where idServer = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            psmt.setInt(1, idServer);
            ResultSet rs = psmt.executeQuery();
            
            if(rs.next()){
                Server sv = createServer(rs);
                
                return sv;
            }
            
            return null;
        }
    }
    
    public List<SuggestedServer> findAll() throws Exception{
        String sql = "select * from server";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
            ResultSet rs = psmt.executeQuery();
            List<SuggestedServer> list = new ArrayList<>();
            while(rs.next()){
                Server sv = createServer(rs);
                SuggestedServer ssv = new SuggestedServer(sv, 0);
                
                list.add(ssv);
            }
            
            return list;
        }
    }

    private Server createServer(final ResultSet rs) throws SQLException {
        Server sv = new Server();
        sv.setIdServer(rs.getInt("idServer"));
        sv.setNameServer(rs.getString("nameServer"));
        sv.setIdOS(rs.getInt("idOS"));
        sv.setDescriptionServer(rs.getString("descriptionServer"));
        sv.setBenchMark(rs.getFloat("benchMark"));
        sv.setPrice(rs.getFloat("price"));
        sv.setTimeRemaining(rs.getInt("timeRemaining"));
        
        return sv;
    }
    
    public List<Server> findServerByOSName(String OSName) throws Exception{
        String sql = "select * from server left join os on server.idOS = os.idOS where nameOS = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
            psmt.setString(1, OSName);
            ResultSet rs = psmt.executeQuery();
            List<Server> list = new ArrayList<>();
            while(rs.next()){
                Server sv = createServer(rs);
                
                list.add(sv);
            }
            
            return list;
        }
    }
    
    public List<SuggestedServer> findAllByOSName(String OSName) throws Exception{
        String sql = "select * from server left join os on server.idOS = os.idOS where nameOS = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
            psmt.setString(1, OSName);
            ResultSet rs = psmt.executeQuery();
            List<SuggestedServer> list = new ArrayList<>();
            while(rs.next()){
                Server sv = createServer(rs);
                SuggestedServer ssv = new SuggestedServer(sv, 0);
                
                list.add(ssv);
            }
            
            return list;
        }
    }
    
    public boolean update(Server sv) throws Exception{
        String sql = "update server set nameServer = ?, idOS = ?, descriptionServer = ?, benchMark = ?, price = ? , timeRemaining = ?"
                    + " where idServer = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            psmt.setInt(7, sv.getIdServer());
            psmt.setString(1, sv.getNameServer());
            psmt.setInt(2, sv.getIdOS());
            psmt.setString(3, sv.getDescriptionServer());
            psmt.setFloat(4, sv.getBenchMark());
            psmt.setFloat(5, sv.getPrice());
            psmt.setInt(6, sv.getTimeRemaining());
            
            return psmt.executeUpdate() > 0;
        }
    }
    
    public boolean delete(int idServer) throws Exception{
        String sql = "delete from server where idServer = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
            psmt.setInt(1, idServer);
            
            return psmt.executeUpdate() > 0;
        }
    }
}
