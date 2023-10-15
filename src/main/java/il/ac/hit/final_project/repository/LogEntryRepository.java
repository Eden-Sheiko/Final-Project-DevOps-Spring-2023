package il.ac.hit.final_project.repository;

import il.ac.hit.final_project.entity.LogEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// LogEntryRepository.java
@Repository
public interface LogEntryRepository extends JpaRepository<LogEntry, Long> {
}