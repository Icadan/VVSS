package note.repository;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import note.model.Elev;

public class EleviRepositoryMock implements EleviRepository{

	private List<Elev> elevi;
	
	public EleviRepositoryMock() {
		elevi = new LinkedList<Elev>();
	}
	
	@Override
	public void addElev(Elev e) {
		// TODO Auto-generated method stub
		elevi.add(e);
	}

	@Override
	public List<Elev> getElevi() {
		// TODO Auto-generated method stub
		return elevi;
	}
	
	@Override
	public void readElevi(String fisier) {
		try {
			FileInputStream fstream = new FileInputStream(fisier);
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(";");
				Elev elev = new Elev(Integer.parseInt(values[0]), values[1]);
				elevi.add(elev);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
