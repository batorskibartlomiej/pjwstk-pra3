/**
 *
 *  @author Batorski Bartłomiej PD2654
 *
 */




package zad1;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class CelFahJlist extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private	JPanel						glPanel;
	private	JList<String>				stopnie;
	
	
	public CelFahJlist() {	
		setTitle("Zamiana na stopnie Fahrenheit");
		
		glPanel = new JPanel();
		glPanel.setLayout( new BorderLayout() );
		getContentPane().add( glPanel );
						
		stopnie = new JList<String>();
		stopnie.setModel(CelFahListModel(-70, 60));
		
		glPanel.add(new JScrollPane(stopnie));
		
	}
	
	
	private DefaultListModel<String> CelFahListModel(double minTemp, double maxTemp) {
		
		DefaultListModel<String> 	listModel;
		
		listModel = new DefaultListModel<String>();
		
		for(int x=(int) minTemp; x<=maxTemp; x++) {
			
			listModel.addElement(x+" stopni Celsjusza = "+String.format("%1$,.2f", CelFah.changeCelFah(x))+" stopni F");	
		}

		return listModel;
	}
	
	
}