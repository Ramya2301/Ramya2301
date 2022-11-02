package FlyWeightPattern;

public class IcecreamOrder {
	  private final int tableNumber;
	  private final IcecreamFlavour flavour;
	  public IcecreamOrder(int tableNumber, IcecreamFlavour flavour) {
	    this.tableNumber = tableNumber;
	    this.flavour = flavour;
	  }
	  public void serveIcecream() {
	    System.out.println("Serving Icecream flavour " + flavour + " to the table number " + tableNumber);
	  }
	}

