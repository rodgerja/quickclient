package com.bearcorp.quickclient;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphanumeric;

import com.bearcorp.quickstart.QuickStart;

public class QuickClient {

  private QuickStart quickStart = new QuickStart();

  public static void main(String[] args) {
    QuickClient quickClient = new QuickClient();

    String str = randomAlphanumeric(10);
    String msg = "I am QuickClient " + quickClient.report(str);

    System.out.println(msg);
  }

  public String report(String msg) {
    return msg + quickStart.square(3);
  }
}
