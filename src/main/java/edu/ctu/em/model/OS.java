/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ctu.em.model;

/**
 *
 * @author quykhang
 */
public class OS {
    private int idOS;
    private String nameOS, descriptionOS;
    private byte[] imageOS;

    public OS() {
        this.idOS = 0;
        this.nameOS = new String();
        this.descriptionOS = new String();
        this.imageOS = null;
    }

    public OS(int idOS, String nameOS, String descriptionOS, byte[] imageOS) {
        this.idOS = idOS;
        this.nameOS = nameOS;
        this.descriptionOS = descriptionOS;
        this.imageOS = imageOS;
    }

    public int getIdOS() {
        return idOS;
    }

    public void setIdOS(int idOS) {
        this.idOS = idOS;
    }

    public String getNameOS() {
        return nameOS;
    }

    public void setNameOS(String nameOS) {
        this.nameOS = nameOS;
    }

    public String getDescriptionOS() {
        return descriptionOS;
    }

    public void setDescriptionOS(String descriptionOS) {
        this.descriptionOS = descriptionOS;
    }

    public byte[] getImageOS() {
        return imageOS;
    }

    public void setImageOS(byte[] imageOS) {
        this.imageOS = imageOS;
    }
      
}
