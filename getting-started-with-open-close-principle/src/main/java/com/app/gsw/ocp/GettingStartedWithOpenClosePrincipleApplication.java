package com.app.gsw.ocp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.gsw.ocp.example1.base.CartProcessorBase;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class GettingStartedWithOpenClosePrincipleApplication implements CommandLineRunner {

  private final CartProcessorBase cartProcessorBase;

  @Autowired
  public GettingStartedWithOpenClosePrincipleApplication(CartProcessorBase cartProcessorBase) {
    this.cartProcessorBase = cartProcessorBase;
  }

  public static void main(String[] args) {
    SpringApplication.run(GettingStartedWithOpenClosePrincipleApplication.class, args);
  }

  @Override
  public void run(String... args) {
    log.info("**********************************************************");
    log.info("Processing User-1 Payment Option as : {}", cartProcessorBase.processCartForUser1());
    log.info("Processing User-2 Payment Option as : {}", cartProcessorBase.processCartForUser2());
    log.info("**********************************************************");
  }
}