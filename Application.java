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

//� "Application / main()" ������� ��� �����:

  //  cupA = � 300 ml ������
    //cupB = � 500 ml ����
    //������ 50 ml ������ �� ����� "cupA"
    //������ ��� 50ml � ����� "cupB"
    //������� � ������� ���������� � "cupA" � "cupB"
