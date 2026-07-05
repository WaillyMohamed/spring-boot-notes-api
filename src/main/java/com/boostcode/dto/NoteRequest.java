package com.boostcode.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

// What clients send when creating/updating a note
// Validation is here not in the entity
public class NoteRequest {
    @NotBlank(message = "Title cannot be empty")
    @Size(max = 255, message = "Title cannot exceed 255 characters.")
    private String title;

    @NotBlank(message = "Content cannot be empty")
    private String content;

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }




}
