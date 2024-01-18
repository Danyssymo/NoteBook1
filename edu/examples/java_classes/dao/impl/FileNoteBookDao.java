package edu.examples.java_classes.dao.impl;

import java.util.Date;
import java.util.List;

import edu.examples.java_classes.dao.DaoException;
import edu.examples.java_classes.dao.NoteBookDao;
import edu.examples.java_classes.entity.Note;
import edu.examples.java_classes.util.CreateNewDate;
import edu.examples.java_classes.util.GenerateId;

public class FileNoteBookDao implements NoteBookDao {


    @Override
    public void save(Note n) throws DaoException {
        n.setId(GenerateId.nextId());

        if (n.getD() == null){
            n.setD(CreateNewDate.addDate());
        }

        FileDataBase.writeToFile(n);
    }

    @Override
    public List<Note> allNotes() throws DaoException {
        return FileDataBase.readFromFile();
    }

}
