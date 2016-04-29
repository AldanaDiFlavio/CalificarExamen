package ar.edu.unlam.tallerweb;

import org.junit.Test;

public class CalificacionesTest {

	@Test
	public void testCalificarExamen(){
		Examen miExamen = new Examen();
		
		try {
			System.out.println(miExamen.calificar(2));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(miExamen.calificar(11));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testEvaluarMateria(){
		Materia miMateria = new Materia();
		try {
			miMateria.evaluar(1,11);
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
		try {
			System.out.println(miMateria.recuperar(1,5));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(miMateria.recuperar(2,null));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
