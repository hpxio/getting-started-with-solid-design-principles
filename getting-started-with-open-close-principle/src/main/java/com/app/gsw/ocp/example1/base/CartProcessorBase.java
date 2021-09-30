package com.app.gsw.ocp.example1.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CartProcessorBase {

  private final PaymentProcessorBase paymentProcessorBase;

  @Autowired
  public CartProcessorBase(PaymentProcessorBase paymentProcessorBase) {
    this.paymentProcessorBase = paymentProcessorBase;
  }

  /* =====[**HELPER-FUNCTIONS**]===== */

  /* Let's say, first user in the cart checks out and provides
   * credit card as payment option. We know what method to call
   * and what payment option to call.
   */
  public String processCartForUser1() {
    return paymentProcessorBase.paymentOptionProvider(0 /*Credit-Card Processor*/);
  }

  /* Now image second user checks out and provides
   * debit card as payment option.
   */
  public String processCartForUser2() {
    return paymentProcessorBase.paymentOptionProvider(1 /*Debit-Card Processor*/);
  }
}