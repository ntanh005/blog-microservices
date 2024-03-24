package com.ndkn.blog;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

import com.ndkn.blog.service.NotificationClient;

import lombok.extern.slf4j.Slf4j;

@RestController

@Slf4j
public class HelloController {
  private final NotificationClient notificationClient;

  public HelloController(NotificationClient notificationClient) {
    this.notificationClient = notificationClient;
  }

  @GetMapping("/hello")
  public ResponseEntity<Map<String, String>> hello() {
    log.info("info blog servcie");
    log.debug("debug blog service");

    var notiResponse = notificationClient.invoke();
    log.info("Noti response: {}", notiResponse);

    return ResponseEntity.ok(Map.of("msg", "ok"));
  }
}
