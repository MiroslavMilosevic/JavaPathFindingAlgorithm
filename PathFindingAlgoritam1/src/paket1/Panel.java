package paket1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Panel extends JPanel{
	public static int visinaPolja=29;
	public static int sirinaPolja=29;
	ArrayList<Polje> lista;
   
	public Panel(ArrayList<Polje> lista) {
		this.lista=lista;
		
	}
	
	@Override
	protected  synchronized void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("bilo koja bojaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		Graphics2D g2=(Graphics2D)g;
	    g2.setColor(Color.DARK_GRAY);
	    
		for(int i=0;i<lista.size();i++) {
			if((lista.get(i).ucitan==true)&&(lista.get(i).DeoNajkracegPuta==0)) {
			g2.setColor(Color.GREEN);	
			System.out.println("zelenoooooooooooooooooooooooooooooooooooooooooooo");
			g2.fill(new Rectangle2D.Double(lista.get(i).xkord, lista.get(i).ykord,visinaPolja, sirinaPolja));
			g2.setColor(Color.DARK_GRAY);
			}
			else if((lista.get(i).DaLiJeCilj==true)&&(lista.get(i).DeoNajkracegPuta==0)){
				g2.setColor(Color.BLUE);
				g2.fill(new Rectangle2D.Double(lista.get(i).xkord, lista.get(i).ykord,visinaPolja, sirinaPolja));
				g2.setColor(Color.DARK_GRAY);
			}
			else if(lista.get(i).DeoNajkracegPuta==1) {
				g2.setColor(Color.ORANGE);
				g2.fill(new Rectangle2D.Double(lista.get(i).xkord, lista.get(i).ykord,visinaPolja, sirinaPolja));
				g2.setColor(Color.DARK_GRAY);
				
			}
			else if(lista.get(i).prepreka==true) {
				g2.setColor(Color.BLACK);
				g2.fill(new Rectangle2D.Double(lista.get(i).xkord, lista.get(i).ykord,visinaPolja, sirinaPolja));
				g2.setColor(Color.DARK_GRAY);
				
			}
			else {
				g2.fill(new Rectangle2D.Double(lista.get(i).xkord, lista.get(i).ykord,visinaPolja, sirinaPolja));
				
			}
			
		}
		
		
	}
	
}
