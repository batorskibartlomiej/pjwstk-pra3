/**
 *
 *  @author Batorski Bartłomiej PD2654
 *
 */



package zad2;

import java.awt.BorderLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;



public class Zad2JList extends javax.swing.JFrame {
	

	//private static final long serialVersionUID = 1L;
	private	JPanel						glPanel;
	
	private	JList<String>				tabList;
	
	private JTextField					txt;
	
	private DefaultListModel<String>	listModel;

public Zad2JList() {		
		
	
	
	setTitle("zadanie 3");
		
		glPanel = new JPanel();
		
		glPanel.setLayout( new BorderLayout() );
		
		getContentPane().add( glPanel );
		tabList = new JList<String>();
						
	listModel = new DefaultListModel<String>();
		
		
		
tabList.setModel(listModel);				
		
		
tabList.addMouseListener( new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
			if (
						
						e.isAltDown() 
						
						
					&& tabList.getSelectedIndex() >= 0
						) 
			{
				
					
				listModel.remove(tabList.getSelectedIndex());
					
				}
			}
		});
		
		txt = new JTextField();
		
		
		
		txt.addKeyListener( new KeyAdapter() {
            
            @Override
        
           public void keyPressed(KeyEvent e)
            {
            	if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            		
            		listModel.addElement(txt.getText());
            		
            		txt.setText("");
            	}
            }
		});
		
		glPanel.add(txt, BorderLayout.PAGE_END);	
		
		glPanel.add(new JScrollPane(tabList));
			
	}
	


}