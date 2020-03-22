/**
 *
 *  @author Batorski Bartłomiej PD2654
 *
 */

package zad1;


import javax.swing.JFrame;


public class Main {
  public static void main(String ... args) {
  
	  
	  CelFahJlist stopnieFrame = new CelFahJlist();
	  
	  stopnieFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
	  stopnieFrame.pack();
	  stopnieFrame.setLocationByPlatform(true);
	  stopnieFrame.setVisible(true);
	  
	  

	  
  }
}