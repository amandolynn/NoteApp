package com.devmountain.noteApp.services;

import com.devmountain.noteApp.dtos.NoteDto;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

public interface NotesService {
    @Transactional
    void addNote(NoteDto noteDto, Long userId);

    @Transactional
    void deleteNote(NoteDto noteDto, Long noteId);

    @Transactional
    void updateNoteById(NoteDto noteDto);

    @Transactional
    List<NoteDto> getAllNotesByUserId(Long userId);

    Optional<NoteDto> getNoteById(Long noteId);

    void deleteNoteById(Long noteId);
}
