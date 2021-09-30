package com.app.gsw.ocp.example1.modified;

import org.springframework.stereotype.Component;

@Component("debitCardProcessor")
public class DebitCardProcessor implements PaymentProcessorModified {

  @Override
  public String paymentProcessorProvider() {
    return "Debit-Card Processor from Modified Class";
  }
}