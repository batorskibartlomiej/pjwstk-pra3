/**
 *
 *  @author Batorski Bartłomiej PD2654
 *
 */

package zad2;
/**
*
*  @author Batorski Bartłomiej PD2654
*
*/

import javax.swing.JFrame;

public class Main {
  public static void main(String ... args) {
  
	 Zad2JList frame = new Zad2JList();
	  
	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
	
	 frame.pack();
	
	 frame.setLocationByPlatform(true);
	 
	 
	 frame.setVisible(true);
	  
  }
}