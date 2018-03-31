package note.repository;

import java.util.List;

import note.model.Elev;

public interface EleviRepository {
	public void addElev(Elev e);
	public List<Elev> getElevi();
	public void readElevi(String fisier);
}
