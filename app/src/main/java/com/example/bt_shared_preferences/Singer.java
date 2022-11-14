package com.example.bt_shared_preferences;

public class Singer {
    private  String name, nghedanh, quocgia, sosao;
    private int  resourceId ;

    public Singer(String name, String nghedanh, String quocgia, String sosao, int resourceId) {
        this.name = name;
        this.nghedanh = nghedanh;
        this.quocgia = quocgia;
        this.sosao = sosao;
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNghedanh() {
        return nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        this.nghedanh = nghedanh;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getSosao() {
        return sosao;
    }

    public void setSosao(String sosao) {
        this.sosao = sosao;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }
}
