package com.rop.notesapp.listeners;

import com.rop.notesapp.entities.Note;

public interface NoteListener {
    void onNoteClicked(Note note, int position);
}
