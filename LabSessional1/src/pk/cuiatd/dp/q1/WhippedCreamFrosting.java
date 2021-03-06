package pk.cuiatd.dp.q1;

public class WhippedCreamFrosting extends BaseDecoration{
	String description = "Whipped Cream Frosting";
	double price = 100;
	public WhippedCreamFrosting(CakeComponent component) {
		super(component);
	}

	@Override
	public double getPrice() {
		return price + component.getPrice();
	}

	@Override
	public String getDescription() {
		return description + " ("+price+"), " +component.getDescription();
	}

}
