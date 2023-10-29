package il.ac.hit.final_project.controller;

import il.ac.hit.final_project.entity.LogEntry;
import il.ac.hit.final_project.repository.LogEntryRepository;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;
import java.util.List;


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

    @PostMapping(consumes = "application/json", produces = "application/json")
    public LogEntry createLogEntry(@Valid @RequestBody LogEntry logEntry) {
        System.out.println(logEntry);
        return logEntryRepository.save(logEntry);
    }
}
