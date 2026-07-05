package com.boostcode.repository;

import com.boostcode.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesApiRepository
        extends JpaRepository<Note, Long> {
}
