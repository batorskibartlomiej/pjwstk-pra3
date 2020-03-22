/**
 *
 *  @author Batorski Bartłomiej PD2654
 *
 */


package zad3;

import javax.swing.*;


public class Book {

	int id;
	float cena;
	String autor, wydawca, tytul;
	ImageIcon zdjecie;

	public Book(int id, String autor, String tytul,
	            String wydawca, float cena, ImageIcon zdjecie) {

	this.id = id;
	
	this.cena = cena;
		this.autor = autor;
	
		this.wydawca = wydawca;
		
		this.tytul = tytul;
		
		this.zdjecie = zdjecie;
	}

	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	
	public float getCena() {
		return cena;
	}

	
	public void setCena(float cena) {
		this.cena = cena;
	}

	
	public String getAutor() {
		return autor;
	}

	
	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	public String getWydawca() {
		return wydawca;
	}

	public void setWydawca(String wydawca) {
		this.wydawca = wydawca;
	}

	
	public String getTytul() {
		return tytul;
	}

	
	public void setTitle(String tytul) {
		this.tytul = tytul;
	}

	
	public ImageIcon getZdjecie() {
		return zdjecie;
	}

	
	public void setZdjecie(ImageIcon zdjecie) {
		this.zdjecie = zdjecie;
	}
}


