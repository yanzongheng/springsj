package com.a.entity;


public class MenusOrder {

  private String d_O_Id;
  private String d_M_Id;
  private String d_Num;

  @Override
  public String toString() {
    return "MenusOrder{" +
            "订单编号='" + d_O_Id + '\'' +
            ", 菜品编号='" + d_M_Id + '\'' +
            ", 数量='" + d_Num + '\'' +
            '}';
  }

  public String getD_O_Id() {
    return d_O_Id;
  }

  public void setD_O_Id(String d_O_Id) {
    this.d_O_Id = d_O_Id;
  }

  public String getD_M_Id() {
    return d_M_Id;
  }

  public void setD_M_Id(String d_M_Id) {
    this.d_M_Id = d_M_Id;
  }

  public String getD_Num() {
    return d_Num;
  }

  public void setD_Num(String d_Num) {
    this.d_Num = d_Num;
  }

  public MenusOrder(String d_O_Id, String d_M_Id, String d_Num) {
    this.d_O_Id = d_O_Id;
    this.d_M_Id = d_M_Id;
    this.d_Num = d_Num;
  }
}
