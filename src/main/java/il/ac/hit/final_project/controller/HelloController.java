package il.ac.hit.final_project.controller;

import il.ac.hit.final_project.entity.LogEntry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;


@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = new URI("http://localhost:" + "8080" + "/logs");

        LocalDateTime now = LocalDateTime.now();

        LogEntry logEntry = new LogEntry("/hello", now.toString());

        ResponseEntity<LogEntry> result = restTemplate.postForEntity(uri, logEntry, LogEntry.class);

        return "Hello, World!";
    }
}
