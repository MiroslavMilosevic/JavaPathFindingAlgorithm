package paket1;

public class Polje {
	 public static boolean DaLiJeCiljPronadjen=false;
	 public static boolean ZaustaviWhile=false;
     int xkord;
     int ykord;
     boolean ucitan=false;
     boolean DaLiJeCilj=false;
     boolean DaLiJePocetak=false;
     boolean prepreka=false;
     int id;
     int idRoditelja=-1;
     int DeoNajkracegPuta=0;
     
	public Polje(int xkord, int ykord, int id) {
		this.xkord=xkord;
		this.ykord=ykord;	
		this.id=id;
	}
}
