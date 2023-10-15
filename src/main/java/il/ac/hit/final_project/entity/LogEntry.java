package il.ac.hit.final_project.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

// LogEntry.java
@Entity
public class LogEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String route;
    private LocalDateTime timestamp;

    public LogEntry(Long id, String route, LocalDateTime timestamp) {
        this.id = id;
        this.route = route;
        this.timestamp = timestamp;
    }

    public LogEntry() {

    }

    public void setMessage(String message) {
    }

    public void setTimestamp(LocalDateTime now) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "id=" + id +
                ", route='" + route + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }

    // getters and setters
}