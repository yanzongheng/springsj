package com.a.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menus {

  private String m_id;
  private String m_name;
  private int m_price;
}
