/**
 *
 *  @author Batorski Bartłomiej PD2654
 *
 */package zad3;
 /**
 *
 *  @author Batorski Bartłomiej PD2654
 *
 */
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;


public class BookTabelaListener implements TableModelListener {

	@Override
	public void tableChanged(TableModelEvent e) {

		
		
		System.out.println("zmiana!!!");

        
		int row = e.getFirstRow();
        
        int column = e.getColumn();
        BookTabela model = (BookTabela) e.getSource();
        
        String columnName = model.getColumnName(column);
       
        Object data = model.getValueAt(row, column);

	}
}