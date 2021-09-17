package com.a.entity;


public class Customer {

  private String c_Name;
  private String c_Sex;
  private String c_Tel;
  private String c_Id;
  private String c_Table;

  public String getC_Name() {
    return c_Name;
  }

  public void setC_Name(String c_Name) {
    this.c_Name = c_Name;
  }

  public String getC_Sex() {
    return c_Sex;
  }

  public void setC_Sex(String c_Sex) {
    this.c_Sex = c_Sex;
  }

  public String getC_Tel() {
    return c_Tel;
  }

  public void setC_Tel(String c_Tel) {
    this.c_Tel = c_Tel;
  }

  public String getC_Id() {
    return c_Id;
  }

  public void setC_Id(String c_Id) {
    this.c_Id = c_Id;
  }

  public String getC_Table() {
    return c_Table;
  }

  public void setC_Table(String c_Table) {
    this.c_Table = c_Table;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "姓名='" + c_Name + '\'' +
            ", 性别='" + c_Sex + '\'' +
            ", 电话='" + c_Tel + '\'' +
            ", 编号='" + c_Id + '\'' +
            ", 所在桌='" + c_Table + '\'' +
            '}';
  }

  public Customer(String c_Name, String c_Sex, String c_Tel, String c_Id, String c_Table) {
    this.c_Name = c_Name;
    this.c_Sex = c_Sex;
    this.c_Tel = c_Tel;
    this.c_Id = c_Id;
    this.c_Table = c_Table;
  }
}
