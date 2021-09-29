package com.app.gsw.srp.example1.before;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/v1/api/user")
public class UserPortal {

    @GetMapping
    public String getUserToken() {
        /* Following consists of hard-coded constant */
        return this.generateUniqueUserToken(30);
    }

    @GetMapping("/{tokenLength}")
    public String getUserToken(@PathVariable int tokenLength) {
        return this.generateUniqueUserToken(tokenLength);
    }


    /* Service that generates UUID for User */
    private String generateUniqueUserToken(int length) {
        if (this.validateTokenLength(length)) {
            return "Error";
        }

        String randomString = this.usingUUID();
        return randomString.substring(0, length);
    }

    /* Util method that supplements UUID Generator service */
    private String usingUUID() {
        UUID randomUUID = UUID.randomUUID();
        return randomUUID.toString().replaceAll("-", "");
    }

    /* Input Validation */
    private boolean validateTokenLength(int length) {
        return (length >= 32 || length < 1);
    }
}