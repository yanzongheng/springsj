package com.a.entity;


public class Table {

  private String t_id;
  private Boolean t_status;

  @Override
  public String toString() {
    return "Table{" +
            "桌子编号='" + t_id + '\'' +
            ", 状态='" + t_status + '\'' +
            '}';
  }

  public String getT_id() {
    return t_id;
  }

  public void setT_id(String t_id) {
    this.t_id = t_id;
  }

  public Boolean getT_Status() {
    return t_status;
  }

  public void setT_Status(Boolean t_Status) {
    this.t_status = t_Status;
  }

  public Table(String t_id, Boolean t_status) {
    this.t_id = t_id;
    this.t_status = t_status;
  }
}
