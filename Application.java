package main;
import kitchen.Cup;

public class Application {

	public static void main(String[] args) {
		kitchen.Cup cupA = new Cup ("Milk", 300);
		kitchen.Cup cupB = new Cup ("Water", 500);
		
	    cupA.setLiquidVolume(250);
	    cupB.setLiquidVolume(550);
		
	System.out.println(cupA.getLiquidName() + " - " + cupA.getLiquidVolume() + "ml");
	System.out.println(cupB.getLiquidName()+ " - " + cupB.getLiquidVolume() + "ml");
	
	}

}

//В "Application / main()" создать две чашки:

  //  cupA = с 300 ml молока
    //cupB = с 500 ml воды
    //вылить 50 ml молока из чашки "cupA"
    //налить еще 50ml в чашку "cupB"
    //вывести в консоль информацию о "cupA" и "cupB"
