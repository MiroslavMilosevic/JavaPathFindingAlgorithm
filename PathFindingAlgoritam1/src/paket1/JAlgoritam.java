package paket1;


import java.util.ArrayList;

//import com.sun.org.apache.bcel.internal.generic.DALOAD;

//import javafx.scene.layout.Pane;

public class JAlgoritam {
  //  Panel p;
 public JAlgoritam() {}
    
  //public JAlgoritam(Panel p) {
	 
	// this.p=p;
	 
// }
 
 
 public synchronized void Djipur(ArrayList<Polje> lista3, Panel p2) throws InterruptedException {

	 ArrayList<Polje> listaUcitanih=new ArrayList<>();
	 for(int i=0;i<lista3.size();i++) {
	if(lista3.get(i).ucitan==true) {
	      	listaUcitanih.add(lista3.get(i));
	} 
	 }
	
	//int brojacWhilePetlje=0; 
while (Polje.ZaustaviWhile==false) {

	
	Thread.currentThread().sleep(500);
		 for(int i=0;i<lista3.size();i++) {
			if(Polje.DaLiJeCiljPronadjen==false) {          
			 if((lista3.get(i).ucitan==false)&&(lista3.get(i).prepreka==false)) {
				 for(int j=0;j<listaUcitanih.size();j++) {
            

						if((((lista3.get(i).xkord+30)==(listaUcitanih.get(j).xkord))&&(lista3.get(i).ykord==listaUcitanih.get(j).ykord))||
					    	(((lista3.get(i).xkord-30)==(listaUcitanih.get(j).xkord))&&(lista3.get(i).ykord==listaUcitanih.get(j).ykord))||
					    	(((lista3.get(i).ykord+30)==(listaUcitanih.get(j).ykord))&&(lista3.get(i).xkord==listaUcitanih.get(j).xkord)) ||
					    	(((lista3.get(i).ykord-30)==(listaUcitanih.get(j).ykord))&&(lista3.get(i).xkord==listaUcitanih.get(j).xkord))   ) {
						
						lista3.get(i).ucitan=true;
						lista3.get(i).idRoditelja=listaUcitanih.get(j).id;/////dodeljujemo id roditelja Kockici !!!
						if(lista3.get(i).DaLiJeCilj==true) {   Polje.DaLiJeCiljPronadjen=true;    lista3.get(i).DeoNajkracegPuta=1;  }
						
						}
						p2.repaint();
						
					 
				 } 
				 }	 
			 }
			else {                                      
				 
				for(int t=0;t<lista3.size();t++) {
					
					if((lista3.get(t).id==lista3.get(i).idRoditelja)&&(lista3.get(i).DeoNajkracegPuta==1)) { lista3.get(t).DeoNajkracegPuta=1; }
					
				}
			}
		
			// p2.repaint();
			
		 }
		 
		 p2.repaint();
	
		 for(int k=0;k<lista3.size();k++) { 
			 if((lista3.get(k).DaLiJePocetak==true)&&(lista3.get(k).DeoNajkracegPuta==1)) {       }
			 if(lista3.get(k).ucitan==true) {  listaUcitanih.add(lista3.get(k));      }
			 if(lista3.get(k).DaLiJePocetak==true&& lista3.get(k).DeoNajkracegPuta==1) {   Polje.ZaustaviWhile=true;      }

	}
		 
		 System.out.println("whileeeeeeeeee");
  }////while
		
	 }
 }

