package com.boostcode.service;

import com.boostcode.dto.NoteRequest;
import com.boostcode.dto.NoteResponse;
import com.boostcode.exception.NoteNotFoundException;
import com.boostcode.model.Note;
import com.boostcode.repository.NotesApiRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    private final NotesApiRepository notesApiRepository;

    public NoteService(NotesApiRepository notesApiRepository) {
        this.notesApiRepository = notesApiRepository;
    }

    public List<NoteResponse> getAllNotes() {
        return notesApiRepository.findAll()
                .stream()
                .map(note -> new NoteResponse(note.getId(), note.getTitle(), note.getContent()))
                .toList();
    }

    public NoteResponse getNoteById(Long id) {
        Note note = notesApiRepository.findById(id)
                .orElseThrow(() -> new NoteNotFoundException(id));
        return new NoteResponse(note.getId(), note.getTitle(), note.getContent());
    }

    public NoteResponse createNote(NoteRequest request) {
        Note note = new Note();
        note.setTitle(request.getTitle());
        note.setContent(request.getContent());

        Note saved = notesApiRepository.save(note);
        return new NoteResponse(saved.getId(), saved.getTitle(), saved.getContent());
    }

    public NoteResponse updateNote(Long id, @Valid NoteRequest updated) {
        Note existing = notesApiRepository.findById(id).orElseThrow(() ->
                new NoteNotFoundException(id));
        existing.setTitle(updated.getTitle());
        existing.setContent(updated.getContent());

        Note saved = notesApiRepository.save(existing);

        return new NoteResponse(saved.getId(), saved.getTitle(), saved.getContent());
    }

    public void deleteNote(Long id){
        if(!notesApiRepository.existsById(id)){
            throw new NoteNotFoundException(id);
        }
        else{
            notesApiRepository.deleteById(id);
        }

    }
}
