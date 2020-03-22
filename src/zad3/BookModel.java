
/**
 *
 *  @author Batorski Bartłomiej PD2654
 *
 */


package zad3;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;



public class BookModel {

	private String path;

	
	public BookModel(String path) {
		this.path = path;
	}

	
	public Object[] getData() {

		Object[] wynik = null;

		try {
			String linia;
			BufferedReader buff = new BufferedReader(new FileReader(path));

			ArrayList<String> storage = new ArrayList<String>();

			while ((linia = buff.readLine()) != null) {
				
				if (linia.length() > 0) {
					
					storage.add(linia);
				}
			}

			buff.close();

			wynik = new Object[storage.size()];
			
			String[] row;

			for (int x = 0; x < storage.size(); x++) {
				
				row = storage.get(x).split("[|]");
				
				wynik[x] = new Book((int) Integer.parseInt(row[0]), row[1],
						row[2], row[3], (float) Float.parseFloat(row[4]),
						new ImageIcon(row[5]));
			}
		} catch (Exception e) {
			System.err.println(e.toString());
			System.exit(1);
		}

		return wynik;
	}
}