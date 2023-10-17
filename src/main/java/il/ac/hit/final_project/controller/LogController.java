package il.ac.hit.final_project.controller;

import il.ac.hit.final_project.entity.LogEntry;
import il.ac.hit.final_project.repository.LogEntryRepository;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;


// LogController.java
@RestController
@RequestMapping("/logs")
public class LogController {

    private final LogEntryRepository logEntryRepository;

    public LogController(LogEntryRepository logEntryRepository) {
        this.logEntryRepository = logEntryRepository;
    }

    @GetMapping
    public List<LogEntry> getAllLogs() {
        return logEntryRepository.findAll();
    }

    @PostMapping(consumes = "application/json")
    public LogEntry createLogEntry(@RequestBody LogEntry logEntry) {
        return logEntryRepository.save(logEntry);
    }
}

//    @PostMapping(path = "/your-endpoint", consumes = "application/x-www-form-urlencoded")
//    public ResponseEntity<?> yourHandlerMethod(@RequestBody MultiValueMap<String, String> formData) {
//        // Handle the form data here
//    }
