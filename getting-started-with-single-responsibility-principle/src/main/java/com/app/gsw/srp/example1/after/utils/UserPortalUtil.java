package com.app.gsw.srp.example1.after.utils;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class UserPortalUtil {

  public String usingUUID() {
    UUID randomUUID = UUID.randomUUID();
    return randomUUID.toString().replaceAll("-", "");
  }
}