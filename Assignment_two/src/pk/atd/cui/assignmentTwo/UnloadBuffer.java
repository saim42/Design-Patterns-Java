package pk.atd.cui.assignmentTwo;

public class UnloadBuffer implements KitchenApplianceReceiver{

	@Override
	public void turnOn() {
		System.out.print(" is turned on.\n");
		
	}

	@Override
	public void turnOff() {
		System.out.print(" is turned Off.\n");
		
	}

}
