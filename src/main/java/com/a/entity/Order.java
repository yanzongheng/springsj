package com.a.entity;


public class Order {

  private String o_Id;
  private String o_T_Id;
  private String o_E_Id;
  private String o_Time;
  private String o_Price;

  public Order(String o_Id, String o_T_Id, String o_E_Id, String o_Time, String o_Price) {
    this.o_Id = o_Id;
    this.o_T_Id = o_T_Id;
    this.o_E_Id = o_E_Id;
    this.o_Time = o_Time;
    this.o_Price = o_Price;
  }

  @Override
  public String toString() {
    return "Order{" +
            "订单编号='" + o_Id + '\'' +
            ", 订单所在桌='" + o_T_Id + '\'' +
            ", 负责订单的服务员编号='" + o_E_Id + '\'' +
            ", 时间='" + o_Time + '\'' +
            ", 消费金额='" + o_Price + '\'' +
            '}';
  }

  public String getO_Id() {
    return o_Id;
  }

  public void setO_Id(String o_Id) {
    this.o_Id = o_Id;
  }

  public String getO_T_Id() {
    return o_T_Id;
  }

  public void setO_T_Id(String o_T_Id) {
    this.o_T_Id = o_T_Id;
  }

  public String getO_E_Id() {
    return o_E_Id;
  }

  public void setO_E_Id(String o_E_Id) {
    this.o_E_Id = o_E_Id;
  }

  public String getO_Time() {
    return o_Time;
  }

  public void setO_Time(String o_Time) {
    this.o_Time = o_Time;
  }

  public String getO_Price() {
    return o_Price;
  }

  public void setO_Price(String o_Price) {
    this.o_Price = o_Price;
  }
}
