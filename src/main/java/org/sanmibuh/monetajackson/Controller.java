package org.sanmibuh.monetajackson;

import io.swagger.v3.oas.annotations.Operation;
import org.javamoney.moneta.Money;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(
    value = "/simple/v1",
    produces = MediaType.APPLICATION_JSON_VALUE
)
public final class Controller {

  @Operation(summary = "Money")
  @GetMapping("/user")
  public UserView getUser() {

    return new UserView("David", "Belmez");
  }

  @Operation(summary = "Money")
  @GetMapping("/money")
  public MoneyView getMoney() {

    return new MoneyView("David", Money.of(100, "EUR"));
  }

}
