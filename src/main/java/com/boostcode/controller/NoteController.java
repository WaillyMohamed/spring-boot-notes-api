package com.boostcode.controller;

import com.boostcode.dto.NoteRequest;
import com.boostcode.dto.NoteResponse;
import com.boostcode.model.Note;
import com.boostcode.service.NoteService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
public class NoteController {
    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    public ResponseEntity<NoteResponse> createNote(@Valid @RequestBody NoteRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(noteService.createNote(request));
    }

    @GetMapping("/{id}")
    public ResponseEntity<NoteResponse> getNoteById(@PathVariable Long id) {
        return ResponseEntity.ok(noteService.getNoteById(id));
    }

    @GetMapping
    public ResponseEntity<List<NoteResponse>> getAllNotes() {
        return ResponseEntity.ok(noteService.getAllNotes());
    }

    @PutMapping("/{id}")
    public ResponseEntity<NoteResponse> updateNote(@PathVariable Long id, @Valid @RequestBody NoteRequest request) {
        return ResponseEntity.ok(noteService.updateNote(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNote(@PathVariable Long id) {
        noteService.deleteNote(id);
        return ResponseEntity.noContent().build();
    }






}
