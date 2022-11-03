package com.testground.classes.enums;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum OrderStatus {
  ORDER_1(1, 10),
  ORDER_2(2, 20),
  ORDER_3(3, 30),
  ORDER_4(4, 40),
  DEFAULT(0, 100),
  ;
  
  private final int code;
  private final int values;

  private OrderStatus(int code, int values) {
    this.code = code;
    this.values = values;
  }

  public int getCode() {
    return code;
  }

  public int getValues() {
    return values;
  }

  public static OrderStatus fromCode(int code) {
    for(OrderStatus o: OrderStatus.values()) {
      if(o.getCode() == code) {
        return o;
      }
    }
    return OrderStatus.DEFAULT;
  }

  public static OrderStatus fromCode2(int code) {
    return Arrays.stream(OrderStatus.values()).filter(e -> e.code == code).findFirst().orElse(DEFAULT);
  }
}
