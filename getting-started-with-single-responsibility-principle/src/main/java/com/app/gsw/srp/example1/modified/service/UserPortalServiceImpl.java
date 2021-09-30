package com.app.gsw.srp.example1.modified.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.gsw.srp.example1.modified.utils.UserPortalUtil;
import com.app.gsw.srp.example1.modified.validation.UserPortalValidation;

@Service
public class UserPortalServiceImpl implements UserPortalService {

  private final UserPortalValidation userPortalValidation;
  private final UserPortalUtil userPortalUtil;

  @Autowired
  public UserPortalServiceImpl(UserPortalValidation userPortalValidation,
                               UserPortalUtil userPortalUtil) {
    this.userPortalValidation = userPortalValidation;
    this.userPortalUtil = userPortalUtil;
  }

  public String generateUniqueUserToken(int length) {
    if (userPortalValidation.validateTokenLength(length)) {
      return "Error";
    }

    String randomString = userPortalUtil.usingUUID();
    return randomString.substring(0, length);
  }
}