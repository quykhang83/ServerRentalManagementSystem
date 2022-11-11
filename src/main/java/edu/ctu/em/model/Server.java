/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ctu.em.model;

import java.util.Comparator;

/**
 *
 * @author quykhang
 */
public class Server {
    private String nameServer, descriptionServer;
    private int idServer, idOS, timeRemaining;
    private float benchMark, price;

    public Server() {
        this.idServer = 0;
        this.nameServer = new String();
        this.descriptionServer = new String();
        this.idOS = 0;
        this.timeRemaining = 0;
        this.benchMark = 0.0F;
        this.price = 0.0F;
    }

    public Server(int idServer, String nameServer, String descriptionServer, int idOS, float benchMark, float price, int timeRemaining) {
        this.idServer = idServer;
        this.nameServer = nameServer;
        this.descriptionServer = descriptionServer;
        this.idOS = idOS;
        this.benchMark = benchMark;
        this.price = price;
        this.timeRemaining = timeRemaining;
    }

    public int getIdServer() {
        return idServer;
    }

    public void setIdServer(int idServer) {
        this.idServer = idServer;
    }

    public String getNameServer() {
        return nameServer;
    }

    public void setNameServer(String nameServer) {
        this.nameServer = nameServer;
    }

    public String getDescriptionServer() {
        return descriptionServer;
    }

    public void setDescriptionServer(String descriptionServer) {
        this.descriptionServer = descriptionServer;
    }

    public int getIdOS() {
        return idOS;
    }

    public void setIdOS(int idOS) {
        this.idOS = idOS;
    }

    public float getBenchMark() {
        return benchMark;
    }

    public void setBenchMark(float benchMark) {
        this.benchMark = benchMark;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }
    
    public double getRatio(){
        return benchMark/price;
    }
      
}
