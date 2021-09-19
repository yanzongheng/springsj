package com.a.entity;


public class Menus {

    private String m_Id;
    private String m_Name;
    private Integer m_Price;

    public Menus(String m_Id, String m_Name, Integer m_Price) {
        this.m_Id = m_Id;
        this.m_Name = m_Name;
        this.m_Price = m_Price;
    }

    public Menus() {
    }

    public String getM_Id() {
        return m_Id;
    }

    public void setM_Id(String m_Id) {
        this.m_Id = m_Id;
    }

    public String getM_Name() {
        return m_Name;
    }

    public void setM_Name(String m_Name) {
        this.m_Name = m_Name;
    }

    public Integer getM_Price() {
        return m_Price;
    }

    public void setM_Price(Integer m_Price) {
        this.m_Price = m_Price;
    }
}
