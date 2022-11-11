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
public class SuggestedServer {
    Server server;
    int rentalTime;

    public SuggestedServer() {
        this.server = null;
        this.rentalTime = 0;
    }
    
    public SuggestedServer(Server server, int rentalTime) {
        this.server = server;
        this.rentalTime = rentalTime;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public int getRentalTime() {
        return rentalTime;
    }

    public void setRentalTime(int rentalTime) {
        this.rentalTime = rentalTime;
    }
    
    public static Comparator<SuggestedServer> byRatio() {
        return new Comparator<SuggestedServer>() {
            @Override
            public int compare(SuggestedServer i1, SuggestedServer i2) {
                return Double.compare(i2.server.getRatio(), i1.server.getRatio());
            }
        };
    }
    
    public static Comparator<SuggestedServer> byLabel() {
        return new Comparator<SuggestedServer>() {
            @Override
            public int compare(SuggestedServer i1, SuggestedServer i2) {
                return i1.server.getIdServer() - i2.server.getIdServer();
            }
        };
    }
}
