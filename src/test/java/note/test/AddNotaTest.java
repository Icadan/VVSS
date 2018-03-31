package note.test;

import static org.junit.Assert.*;

import note.model.Nota;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import note.utils.ClasaException;
import note.utils.Constants;

import note.controller.NoteController;

public class AddNotaTest {
	
	private NoteController ctrl;
	
	@Before
	public void init(){
		ctrl = new NoteController();
	}
	
	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	@Test
	public void test1() throws ClasaException {
		Nota nota = new Nota(1, "Desen", 10);
		ctrl.addNota(nota);
		assertEquals(1, ctrl.getNote().size());
	}
	
	@Test
	public void test2() throws ClasaException {
		expectedEx.expect(ClasaException.class);
		expectedEx.expectMessage(Constants.invalidNrmatricol);
		Nota nota = new Nota(10.1, "Istorie", 5);
		ctrl.addNota(nota);
	}
	
	@Test
	public void test3() throws ClasaException {
		expectedEx.expect(ClasaException.class);
		expectedEx.expectMessage(Constants.invalidNrmatricol);
		Nota nota = new Nota(0, "Istorie", 5);
		ctrl.addNota(nota);
	}
	
	@Test
	public void test4() throws ClasaException {
		expectedEx.expect(ClasaException.class);
		expectedEx.expectMessage(Constants.invalidMateria);
		Nota nota = new Nota(1, "Isto", 5);
		ctrl.addNota(nota);
	}
	
	@Test
	public void test5() throws ClasaException {
		expectedEx.expect(ClasaException.class);
		expectedEx.expectMessage(Constants.invalidNota);
		Nota nota = new Nota(1, "Istorie", 5.002);
		ctrl.addNota(nota);
	}
	
	@Test
	public void test6() throws ClasaException {
		expectedEx.expect(ClasaException.class);
		expectedEx.expectMessage(Constants.invalidNota);
		Nota nota = new Nota(1, "Istorie", 11);
		ctrl.addNota(nota);
	}
	
	@Test
	public void test7() throws ClasaException {
		Nota nota = new Nota(2, "Istorie", 10);
		ctrl.addNota(nota);
		assertEquals(1, ctrl.getNote().size());
	}
	
	@Test
	public void test8() throws ClasaException {
		Nota nota = new Nota(1000, "Istorie", 10);
		ctrl.addNota(nota);
		assertEquals(1, ctrl.getNote().size());
	}
	
	@Test
	public void test9() throws ClasaException {
		Nota nota = new Nota(999, "Istorie", 10);
		ctrl.addNota(nota);
		assertEquals(1, ctrl.getNote().size());
	}
	
	@Test
	public void test10() throws ClasaException {
		expectedEx.expect(ClasaException.class);
		expectedEx.expectMessage(Constants.invalidNrmatricol);
		Nota nota = new Nota(1001, "Istorie", 5);
		ctrl.addNota(nota);
	}
	
	@Test
	public void test11() throws ClasaException {
		Nota nota = new Nota(1000, "Desena", 10);
		ctrl.addNota(nota);
		assertEquals(1, ctrl.getNote().size());
	}

	@Test
	public void test12() throws ClasaException {
		Nota nota = new Nota(1000, "DesenDesenDesenDesen", 10);
		ctrl.addNota(nota);
		assertEquals(1, ctrl.getNote().size());
	}
	
	@Test
	public void test13() throws ClasaException {
		Nota nota = new Nota(1000, "DesenDesenDesenDese", 10);
		ctrl.addNota(nota);
		assertEquals(1, ctrl.getNote().size());
	}

	
	@Test
	public void test14() throws ClasaException {
		expectedEx.expect(ClasaException.class);
		expectedEx.expectMessage(Constants.invalidMateria);
		Nota nota = new Nota(1, "DesenDesenDesenDesenD", 5);
		ctrl.addNota(nota);
	}
	
	@Test
	public void test15() throws ClasaException {
		Nota nota = new Nota(1000, "DesenDesenDesenDese", 1);
		ctrl.addNota(nota);
		assertEquals(1, ctrl.getNote().size());
	}
	
	@Test
	public void test16() throws ClasaException {
		Nota nota = new Nota(1000, "DesenDesenDesenDese", 2);
		ctrl.addNota(nota);
		assertEquals(1, ctrl.getNote().size());
	}
	
	@Test
	public void test17() throws ClasaException {
		Nota nota = new Nota(1000, "DesenDesenDesenDese", 9);
		ctrl.addNota(nota);
		assertEquals(1, ctrl.getNote().size());
	}
	
	@Test
	public void test18() throws ClasaException {
		expectedEx.expect(ClasaException.class);
		expectedEx.expectMessage(Constants.invalidNota);
		Nota nota = new Nota(1, "Istorie", 0);
		ctrl.addNota(nota);
	}
	
	@Test
	public void test19() throws ClasaException {
		expectedEx.expect(ClasaException.class);
		expectedEx.expectMessage(Constants.invalidMateria);
		Nota nota = new Nota(1, "", 5);
		ctrl.addNota(nota);
	}
	
	@Test
	public void test20() throws ClasaException {
		expectedEx.expect(ClasaException.class);
		expectedEx.expectMessage(Constants.invalidMateria);
		Nota nota = new Nota(1, "a", 5);
		ctrl.addNota(nota);
	}
	
	@Test
	public void test21() throws ClasaException {
		expectedEx.expect(ClasaException.class);
		expectedEx.expectMessage(Constants.invalidNota);
		Nota nota = new Nota(1, "Istorie", -2);
		ctrl.addNota(nota);
	}
	
	@Test
	public void tes22() throws ClasaException {
		expectedEx.expect(ClasaException.class);
		expectedEx.expectMessage(Constants.invalidNrmatricol);
		Nota nota = new Nota(-1001, "Istorie", 5);
		ctrl.addNota(nota);
	}
}
