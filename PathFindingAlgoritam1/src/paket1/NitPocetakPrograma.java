package paket1;

public class NitPocetakPrograma extends Thread{
     Panel p;
    public NitPocetakPrograma(Panel p) {
		this.p=p;
	}	
	
	@Override
	public void run() {
	
		p.repaint();
	}
	
	
}
