public class Service {
  private String beauticianName;
  private boolean isAvailable;
  private double price;

public Service() {
  this.beauticianName = "person 1";
  this.isAvailable = false;
  this.price = 0.0;
}
public Service(String beauticianName, boolean issAvailable, double price) {
  this.beauticianName = beauticianName;
  this.isAvailable = isAvailable;
  this.price = price;
}

  public String getBeauticianName() {
    return beauticianName;
  }

  public boolean getIsAvailable() {
    return isAvailable;
  }

  public double getPrice() {
    return price;
  }

  public void getBeauticianName(String beauticianName) {
    this.beauticianName = beauticianName;
  }

  public void getIsAvailable(boolean isAvailable) {
    this.isAvailable = isAvailable;
  }

  public void getPrice(double price) {
    this.price = price;
  }

  public String toString() {
    String s = "Name: " + beauticianName + ", Is available? " + isAvailable + ", price: " + price;
    return s;
  }

}