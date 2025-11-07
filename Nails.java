public class Nails extends Service {
  String length;
  int numCharms;
  String color;

  public Nails() {
    super();
    this.length = "Medium";
    this.numCharms = 0;
    this.color = "French";
  }

  public Nails(String beauticianName, boolean isAvailable, double price, String length, int numCharms, String color){
    super(beauticianName, isAvailable, price);
    this.length = length;
    this.numCharms = numCharms;
    this.color = color;
  }


  
  public String getLength() {
    return length;
  }

  public int getNumCharms() {
    return numCharms;
  }

  public String getColor() {
    return color;
  }

  public void setLength(String lengthUpdate) {
    length = lengthUpdate;
  }

  public void setNumCharms(int numCharmsUpdate) {
    numCharms = numCharmsUpdate;
  }

  public void setColor(String colorUpdate) {
    color = colorUpdate;
  }

  public String toString() {
    String text = "Service: Nails\n";
     text += super.toString();
     text += ", Length: " + length + ", Charms: " + numCharms + "Color: " + color;
     return text;
  }




  
}