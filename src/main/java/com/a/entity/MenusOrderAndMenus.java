package com.a.entity;

public class MenusOrderAndMenus {
    private String mName;
    private String mPrice;
    private String dNum;

    public MenusOrderAndMenus() {
    }

    public String getM_Name() {
        return mName;
    }

    public void setM_Name(String m_Name) {
        this.mName = m_Name;
    }

    public String getM_Price() {
        return mPrice;
    }

    public void setM_Price(String m_Price) {
        this.mPrice = m_Price;
    }

    public String getD_Num() {
        return dNum;
    }

    public void setD_Num(String d_Num) {
        this.dNum = d_Num;
    }

    public MenusOrderAndMenus(String m_Name, String m_Price, String d_Num) {
        this.mName = m_Name;
        this.mPrice = m_Price;
        this.dNum = d_Num;
    }
}
