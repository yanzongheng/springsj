package com.a.entity;


public class MenusOrder {

    private String d_t_Id;
    private String d_m_Id;
    private String d_num;

    public MenusOrder(String d_t_Id, String d_m_Id, String d_num) {
        this.d_t_Id = d_t_Id;
        this.d_m_Id = d_m_Id;
        this.d_num = d_num;
    }

    public MenusOrder() {
    }

    public String getD_t_Id() {
        return d_t_Id;
    }

    public void setD_t_Id(String d_t_Id) {
        this.d_t_Id = d_t_Id;
    }

    public String getD_m_Id() {
        return d_m_Id;
    }

    public void setD_m_Id(String d_m_Id) {
        this.d_m_Id = d_m_Id;
    }

    public String getD_num() {
        return d_num;
    }

    public void setD_num(String d_num) {
        this.d_num = d_num;
    }
}
