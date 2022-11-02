package FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;
public class IcecreamMenu {
  private Map<String, IcecreamFlavour> map = new HashMap<String, IcecreamFlavour>();
  public IcecreamFlavour lookup(String flavourName) {
    if (!map.containsKey(flavourName)) {
      map.put(flavourName, new IcecreamFlavour(flavourName));
    }
    return map.get(flavourName);
  }
  public int totalIcecreamFlavours() {
    return map.size();
  }
}

