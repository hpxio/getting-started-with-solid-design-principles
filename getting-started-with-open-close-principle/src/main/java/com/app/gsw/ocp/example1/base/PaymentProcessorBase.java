package com.app.gsw.ocp.example1.base;

import org.springframework.stereotype.Service;

/**
 * Payment Processor Implementation
 * Payment Processing is based on User Input. Checkout system will ask Payment
 * Processor to provide methods to settle transactions. Following method is a
 * simple implementation of a payment-processor based on User's selected payment
 * option.
 */
@Service
public class PaymentProcessorBase {

  /**
   * Input Mapping:
   * 1 -> Credit Card
   * 2 -> Debit Card
   *
   * @param type Payment Option provided by User
   * @return String Payment Processor Class
   */
  protected String paymentOptionProvider(int type) {
    return switch (type) {
      case 0 -> "Credit Card";
      case 1 -> "Debit Card";
      default -> "Invalid Choice!!";
    };
  }
}