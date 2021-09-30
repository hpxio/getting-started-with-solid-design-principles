package com.app.gsw.ocp.example1.modified;

import org.springframework.stereotype.Component;

@Component("creditCardProcessor")
public class CreditCardProcessor implements PaymentProcessorModified {

  @Override
  public String paymentProcessorProvider() {
    return "Credit-Card Processor from Modified Class";
  }
}