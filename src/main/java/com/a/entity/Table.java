package com.a.entity;


public class Table {

  private String tid;
  private Boolean tstatus;

  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public Boolean getTstatus() {
    return tstatus;
  }

  public void setTstatus(Boolean tstatus) {
    this.tstatus = tstatus;
  }

  public Table(String tid, Boolean tstatus) {
    this.tid = tid;
    this.tstatus = tstatus;
  }
}
