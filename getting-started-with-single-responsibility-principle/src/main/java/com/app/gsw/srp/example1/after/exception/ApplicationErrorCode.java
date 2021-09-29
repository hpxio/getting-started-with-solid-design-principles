package com.app.gsw.srp.example1.after.exception;

public enum ApplicationErrorCode {
  INVALID_INPUT("invalid.input", "Field provided does not pass validation!")
  ;

  private ApplicationErrorCode(String name, String message) {
    this.name = name;
    this.message = message;
  }

  private final String name;
  private final String message;

  public String getName() {
    return name;
  }

  public String getMessage() {
    return message;
  }
}