package org.sanmibuh.monetajackson;

import com.fasterxml.jackson.databind.Module;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.zalando.jackson.datatype.money.MoneyModule;

@SpringBootApplication
public class MonetaJacksonApplication {

  public static void main(final String[] args) {
    SpringApplication.run(MonetaJacksonApplication.class, args);
  }
  
  @Bean
  public Module moneyModule() {
    return new MoneyModule();
  }

}
