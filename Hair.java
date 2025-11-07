public class Hair extends Service{
  boolean isCut;
  String dyeColor;

  public Hair() {
    super();
    this.isCut = true;
    this.dyeColor = "brown";
  }

  public Hair(String beauticianName, boolean isAvailable, double price, boolean isCut, String dyeColor){
    super(beauticianName, isAvailable, price);
    this.isCut = isCut;
    this.dyeColor = dyeColor;
  }

  public boolean getIsCut(){
    return isCut;
  }

  public String getDyeColor(){
    return dyeColor;
  }

  public void setIsCut(boolean isCut){
    this.isCut = isCut;
  }

  public void setDyeColor(String dyeColor){
    this.dyeColor = dyeColor;
  }

   public String toString() {
    String text = "Service: Hair\n";
     text += super.toString();
     text += ", Is Cut? " + isCut + ", Dye color: " + dyeColor;
     return text;
  }





  
}