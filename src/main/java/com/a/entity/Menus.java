package com.a.entity;


public class Menus {

  private String mId;
  private String mName;
  private int mPrice;

  public Menus(String mId, String mName, int mPrice) {
    this.mId = mId;
    this.mName = mName;
    this.mPrice = mPrice;
  }

  public String getMId() {
    return mId;
  }

  public void setMId(String mId) {
    this.mId = mId;
  }


  public String getMName() {
    return mName;
  }

  public void setMName(String mName) {
    this.mName = mName;
  }


  public long getMPrice() {
    return mPrice;
  }

  public void setMPrice(int mPrice) {
    this.mPrice = mPrice;
  }

}
