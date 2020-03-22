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



import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;


public class Main extends JFrame {

	
	public Main() {
		init();
		initGUI();
	}

	
	public void init() {

		JTable table = new JTable(new BookTabela(
				"data/data.txt"));

		table.setAutoCreateRowSorter(true);

		DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
		renderer.setBackground(Color.GREEN);
		renderer.setForeground(Color.YELLOW);
		table.getColumn(BookTabela.CENA_NAME).setCellRenderer(
				renderer);

		add(new JScrollPane(table));
	}

	
	public void initGUI() {


		setTitle("zadanko 3 tabela");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(new Dimension(950, 400));
		
		setLocationRelativeTo(null);

		setVisible(true);
	}

	
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Main();
			}
		});
	}
}