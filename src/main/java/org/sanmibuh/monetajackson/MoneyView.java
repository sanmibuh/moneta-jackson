package org.sanmibuh.monetajackson;

import org.javamoney.moneta.Money;

public class MoneyView {

  private final String name;
  private final Money amount;

  public MoneyView(final String name, final Money amount) {
    this.name = name;
    this.amount = amount;
  }

  public String getName() {
    return name;
  }

  public Money getAmount() {
    return amount;
  }
}
