package com.app.gsw.srp.example1.after.controller;

import com.app.gsw.srp.example1.after.contants.ApplicationConstants;
import com.app.gsw.srp.example1.after.service.UserPortalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v2/api/user")
public final class UserPortalController {

    private final UserPortalService userPortalService;

    @Autowired
    public UserPortalController(UserPortalService userPortalService) {
        this.userPortalService = userPortalService;
    }

    @GetMapping
    public String getUserToken() {
        return userPortalService.generateUniqueUserToken(ApplicationConstants.UserTokenLength);
    }

    @GetMapping("/{tokenLength}")
    public String getUserToken(@PathVariable int tokenLength) {
        return userPortalService.generateUniqueUserToken(tokenLength);
    }
}