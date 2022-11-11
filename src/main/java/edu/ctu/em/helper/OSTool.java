/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ctu.em.helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import edu.ctu.em.model.OS;

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
public class OSTool{
    public boolean insert(OS os) throws Exception{
        String sql = "insert into os(idOS, nameOS, descriptionOS, imageOS) values(?,?,?,?)";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            psmt.setInt(1, os.getIdOS());
            psmt.setString(2, os.getNameOS());
            psmt.setString(3, os.getDescriptionOS());
//            File input = null;
//            BufferedImage read = ImageIO.read(input);
            
            if(os.getImageOS() != null){
                Blob img = new SerialBlob(os.getImageOS());
                psmt.setBlob(4, img);
            }else{
                Blob img = null;
                psmt.setBlob(4, img);
            }
                     
            return psmt.executeUpdate() > 0;
        }
    }
    
    public OS findById(int idOS) throws Exception{
        String sql = "select * from os where idOS = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            psmt.setInt(1, idOS);
            ResultSet rs = psmt.executeQuery();
            
            if(rs.next()){
                OS os = createOS(rs);
                
                return os;
            }
            
            return null;
        }
    }
    
    public OS findByName(String nameOS) throws Exception{
        String sql = "select * from os where nameOS = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            psmt.setString(1, nameOS);
            ResultSet rs = psmt.executeQuery();
            
            if(rs.next()){
                OS os = createOS(rs);
                return os;
            }
            return null;
        }
    }
    
    public List<OS> findAll() throws Exception{
        String sql = "select * from os";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
            ResultSet rs = psmt.executeQuery();
            List<OS> list = new ArrayList<>();
            while(rs.next()){
                OS os = createOS(rs);
                
                list.add(os);
            }
            
            return list;
        }
    }
    
    public List<String> getAllOSName() throws Exception{
        String sql = "select nameOS from os";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
            ResultSet rs = psmt.executeQuery();
            List<String> list = new ArrayList<>();
            while(rs.next()){
                list.add(rs.getString("nameOS"));
            }
            
            return list;
        }
    }

    private OS createOS(final ResultSet rs) throws SQLException {
        OS os = new OS();
        os.setIdOS(rs.getInt("idOS"));
        os.setNameOS(rs.getString("nameOS"));
        os.setDescriptionOS(rs.getString("descriptionOS"));
        Blob blob = rs.getBlob("imageOS");
        if(blob != null)
            os.setImageOS(blob.getBytes(1, (int) blob.length()));
        return os;
    }
    
    public boolean update(OS os) throws Exception{
        String sql = "update os set nameOS = ?, descriptionOS = ?, imageOS = ? "
                    + " where idOS = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            psmt.setInt(4, os.getIdOS());
            psmt.setString(1, os.getNameOS());
            psmt.setString(2, os.getDescriptionOS());
//            File input = null;
//            BufferedImage read = ImageIO.read(input);
            
            if(os.getImageOS() != null){
                Blob img = new SerialBlob(os.getImageOS());
                psmt.setBlob(3, img);
            }else{
                Blob img = null;
                psmt.setBlob(3, img);
            }
            return psmt.executeUpdate() > 0;
        }
    }
    
    public boolean delete(int idOS) throws Exception{
        String sql = "delete from os where idOS = ?";
        try(
                Connection con = DatabaseHelper.openConnection();
                PreparedStatement psmt = con.prepareStatement(sql);
            ){
            
            psmt.setInt(1, idOS);
            
            return psmt.executeUpdate() > 0;
        }
    }
}
