package main;
import kitchen.Cup;

public class Application {

	public static void main(String[] args) {
		kitchen.Cup cupA = new Cup ("Milk", 300);
		kitchen.Cup cupB = new Cup ("Water", 500);
		
	    cupA.setLiquidVolume(cupA.getLiquidVolume() - 50);
	    cupB.setLiquidVolume(cupB.getLiquidVolume() + 50);
		
	System.out.println(cupA.getLiquidName() + " - " + cupA.getLiquidVolume() + "ml");
	System.out.println(cupB.getLiquidName()+ " - " + cupB.getLiquidVolume() + "ml");
	
	}

}

