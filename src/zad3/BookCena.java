/**
 *
 *  @author Batorski Bartłomiej PD2654
 *
 */




package zad3;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;


public class BookCena extends JLabel implements TableCellRenderer {

	boolean isBordered;

	
	public BookCena(boolean isBordered) {
		
		this.isBordered = isBordered;
		setOpaque(true);
	}

	
	@Override
	public Component getTableCellRendererComponent(JTable table, Object color,
	                                               boolean isSelected, boolean hasFocus, int row, int column) {

		setForeground(Color.BLUE);
		setBackground(Color.GREEN);

		return this;
	}
}