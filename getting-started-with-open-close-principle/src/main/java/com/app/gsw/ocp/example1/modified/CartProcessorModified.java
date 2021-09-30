package com.app.gsw.ocp.example1.modified;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CartProcessorModified {

  @Autowired
  PaymentProcessorModified creditCardProcessor;

  @Autowired
  PaymentProcessorModified debitCardProcessor;

  /* =====[**FACTORY-LOGIC**]===== */
  public String processPayments(int type){
    switch (type){
      case 0:
        return creditCardProcessor.paymentProcessorProvider();

      case 1:
        return debitCardProcessor.paymentProcessorProvider();

      default:
        return "Invalid Processor!!";
    }
  }
}