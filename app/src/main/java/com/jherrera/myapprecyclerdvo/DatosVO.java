package com.jherrera.myapprecyclerdvo;

public class DatosVO {
    private String nombreR;
    private String telefonoR;
    private int imagenR;

    public DatosVO() {
    }

    public DatosVO(String nombreR, String telefonoR, int imagenR) {
        this.nombreR = nombreR;
        this.telefonoR = telefonoR;
        this.imagenR = imagenR;
    }

    public String getNombreR() {
        return nombreR;
    }

    public void setNombreR(String nombreR) {
        this.nombreR = nombreR;
    }

    public String getTelefonoR() {
        return telefonoR;
    }

    public void setTelefonoR(String telefonoR) {
        this.telefonoR = telefonoR;
    }

    public int getImagenR() {
        return imagenR;
    }

    public void setImagenR(int imagenR) {
        this.imagenR = imagenR;
    }
}
