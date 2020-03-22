/**
 *
 *  @author Batorski Bartłomiej PD2654
 *
 */


package zad3;
/**
*
*  @author Batorski Bartłomiej PD2654
*
*/

import javax.swing.table.AbstractTableModel;


public class BookTabela extends AbstractTableModel {

	public final static int ID_IDX = 0;
	
	public final static int AUTOR_IDX = 1;
	
	public final static int TYTUL_IDX = 2;
	
	public final static int WYDAWCA_IDX = 3;
	
	public final static int CENA_IDX = 4;
	
	public final static int ZDJECIE_IDX = 5;

	public final static String ID_NAME = "ID";
	
	public final static String AUTOR_NAME = "Autor";
	
	public final static String TYTUL_NAME = "Tytuł";
	
	public final static String WYDAWCA_NAME = "Wydawca";
	public final static String CENA_NAME = "Cena";
	public final static String ZDJECIE_NAME = "Okładka";

	private final static String[] columnNames = {ID_NAME, AUTOR_NAME,
			TYTUL_NAME, WYDAWCA_NAME, CENA_NAME, ZDJECIE_NAME};
	private Object[] ksiazka;

	
	public BookTabela(String pathToStorageFile) {

		try {
			addTableModelListener(new BookTabelaListener());

			BookModel model = new BookModel(pathToStorageFile);
			ksiazka = model.getData();
		} catch (Exception e) {
			System.err.println(e.toString());
			System.exit(1);
		}
	}


	@Override
	public int getColumnCount() {
		return columnNames.length;
	}

	
	@Override
	public String getColumnName(int column) {
		return columnNames[column];
	}

	
	@Override
	public int getRowCount() {
		return ksiazka.length;
	}

	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		if (ksiazka == null)
			return null;

		Book book = (Book) ksiazka[rowIndex];

		switch (columnIndex) {
			case ID_IDX:
				return book.getId();
			case AUTOR_IDX:
				return book.getAutor();
			case ZDJECIE_IDX:
				return book.getZdjecie();
			case CENA_IDX:
				return book.getCena();
			case WYDAWCA_IDX:
				return book.getWydawca();
			case TYTUL_IDX:
				return book.getTytul();
		}

		return null;
	}

	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}
}