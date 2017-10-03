/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 36 "Lab6.ump"
public class Order
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Order Attributes
  private int cost;
  private int orderDate;
  private int orderID;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Order(int aCost, int aOrderDate, int aOrderID)
  {
    cost = aCost;
    orderDate = aOrderDate;
    orderID = aOrderID;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setCost(int aCost)
  {
    boolean wasSet = false;
    cost = aCost;
    wasSet = true;
    return wasSet;
  }

  public boolean setOrderDate(int aOrderDate)
  {
    boolean wasSet = false;
    orderDate = aOrderDate;
    wasSet = true;
    return wasSet;
  }

  public boolean setOrderID(int aOrderID)
  {
    boolean wasSet = false;
    orderID = aOrderID;
    wasSet = true;
    return wasSet;
  }

  public int getCost()
  {
    return cost;
  }

  public int getOrderDate()
  {
    return orderDate;
  }

  public int getOrderID()
  {
    return orderID;
  }

  public void delete()
  {}

  // line 44 "Lab6.ump"
  public void makeOrder(int price, int date){
    
  }

  // line 48 "Lab6.ump"
  public int checkOrderDate(){
    return orderDate;
  }


  public String toString()
  {
    return super.toString() + "["+
            "cost" + ":" + getCost()+ "," +
            "orderDate" + ":" + getOrderDate()+ "," +
            "orderID" + ":" + getOrderID()+ "]";
  }
}