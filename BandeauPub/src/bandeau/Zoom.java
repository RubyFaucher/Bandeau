package bandeau;

import java.awt.Font;

public class Zoom extends Effet {
	
	
	
	public Zoom(Bandeau bandeau) {
		super(bandeau);
		
	}
	public void play() {
		
		for (int i = 5; i < 60 ; i+=5) {
			this.bandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
			this.bandeau.sleep(100);
		}
	}
}
