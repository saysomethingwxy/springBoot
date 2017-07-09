package it;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("it.mapper.*")
@EnableCaching
public class Appliction extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(Appliction.class, args);

  }
}
