package FlyWeightPattern;
//We first create a class, IcecreamFlavour, which represents different flavours of icecream.
public class IcecreamFlavour {
  private String flavourName;
  public IcecreamFlavour(String flavourName) {
    this.flavourName = flavourName;
  }
  @Override
  public String toString() {
    return flavourName;
  }
}
