package paket1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Glavna {

	public static void main(String[] args) throws InterruptedException {
		
		int VisinaProzora=500;
		int SirinaProzora=600;
		
		ArrayList<Polje> lista2=new ArrayList<>();
		int xx=50;
		int yy=100;
		int idBrojac=0;
		for(int j=0;j<12;j++) {
		
		for(int i=0;i<10;i++) {
			idBrojac++;
			lista2.add(new Polje(xx, yy, idBrojac));
			yy+=30;
		}
		yy=100;
		xx+=30;
		}
		lista2.get(9).ucitan=true; lista2.get(9).DaLiJePocetak=true;
		lista2.get(100).DaLiJeCilj=true;
		//lista2.get(22).DeoNajkracegPuta=1;
		lista2.get(42).prepreka=true;
	  //  lista2.get(43).prepreka=true;
	    lista2.get(44).prepreka=true;
	    lista2.get(45).prepreka=true;
	    lista2.get(46).prepreka=true;
	    lista2.get(47).prepreka=true;
	    lista2.get(35).prepreka=true;
	  //  lista2.get(33).prepreka=true;
	    lista2.get(36).prepreka=true;
	    lista2.get(37).prepreka=true;
	    lista2.get(48).prepreka=true;
	    lista2.get(49).prepreka=true;
	    
	    lista2.get(32).prepreka=true;
	    lista2.get(22).prepreka=true;
	    lista2.get(12).prepreka=true;
	    lista2.get(2).prepreka=true;
		
		
		
		JFrame prozor=new JFrame();
		 Panel panelCentar=new Panel(lista2);
	  
	  	JPanel panelSever=new JPanel();
		JButton dugmePocetak=new JButton("Pronadji!");
		//panelSever.add(dugmePocetak);
	     
	    JAlgoritam algoritam=new JAlgoritam();
		
		//panelSever.add(dugmePocetak);
     //   prozor.add(panelSever, BorderLayout.NORTH);
		prozor.add(panelCentar);
		prozor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prozor.setBounds(600, 500, VisinaProzora, SirinaProzora);
		prozor.setTitle("PathFindinAlgoritam");
		prozor.setVisible(true);
	    algoritam.Djipur(lista2, panelCentar);
		
		
	
	

	

		}

}
