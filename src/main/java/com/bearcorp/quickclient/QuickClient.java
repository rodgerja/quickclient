package com.bearcorp.quickclient;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;

public class QuickClient {

  public static void main(String[] args) {
    String str = randomAlphanumeric(10);
    System.out.println("I am QuickStart " + str);
  }

  public long square(int n) {
    return n * n;
  }

  public long doubler(int n) {
    return n + n;
  }
}
