package DecoratorPattern;

public class NonVegPizza implements Pizza {
	  @Override
	  public String size() {
	    return "Big";
	  }
	  @Override
	  public String ingredients() {
	    return "Mutton";
	  }

}
