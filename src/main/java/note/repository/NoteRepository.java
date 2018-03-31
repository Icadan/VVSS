package note.repository;

import java.util.List;


import note.model.Nota;
import note.utils.ClasaException;

public interface NoteRepository {
	
	public void addNota(Nota nota) throws ClasaException;
	public List<Nota> getNote(); 
	public void readNote(String fisier);
	
}
