package bandeau;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private final Bandeau monBandeau = new Bandeau();
    
    public static void main(String[] args) {
    		Bandeau bandeau = new Bandeau();
    		Zoom zoom = new Zoom(bandeau);
 		Rotation rotategauche90=new Rotation(bandeau,"gauche",90);
 		Rotation rotatedroite180=new Rotation(bandeau,"droite",180);
 		AffichageColore aff=new AffichageColore(bandeau,"Bla bla");
 		ChangeFontColor chgmtcouleur=new ChangeFontColor(bandeau);
 		ChangeBackground background=new ChangeBackground(bandeau);
 		
 		List<Effet> mesEffets = new ArrayList<Effet>();
 		List<Integer> repetitions = new ArrayList<Integer>();
    		
    		bandeau.sleep(2000);
    		
    		
    		mesEffets.add(aff);
 		repetitions.add(1);
 		mesEffets.add(background);
 		repetitions.add(1);
 		mesEffets.add(zoom);
 		repetitions.add(1);
 		mesEffets.add(background);
 		repetitions.add(1);
 		mesEffets.add(chgmtcouleur);
 		repetitions.add(1);
 		mesEffets.add(rotategauche90);
 		repetitions.add(1);
 		mesEffets.add(background);
 		repetitions.add(1);
 		mesEffets.add(chgmtcouleur);
 		repetitions.add(1);
 		mesEffets.add(rotatedroite180);
 		repetitions.add(1);
 		mesEffets.add(chgmtcouleur);
 		repetitions.add(1);
 		
 		Scenario s1 = new Scenario(mesEffets,repetitions);
 		
 		s1.play();
 		
 		
	
    }
}