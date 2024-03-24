package com.ndkn.notification;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import lombok.extern.slf4j.Slf4j;

@RestController

@Slf4j
public class HelloController {

  @GetMapping("/hello")
  public ResponseEntity<Map<String, String>> hello() {
    log.info("I'm notification service");
    return ResponseEntity.ok(Map.of("service", "notification"));
  }

}
