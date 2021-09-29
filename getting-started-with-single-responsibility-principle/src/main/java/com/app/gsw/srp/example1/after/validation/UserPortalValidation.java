package com.app.gsw.srp.example1.after.validation;

import org.springframework.stereotype.Component;

@Component
public class UserPortalValidation {

  public boolean validateTokenLength(int length) {
    return (length >= 32 || length < 1);
  }
}