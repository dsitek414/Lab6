/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.26.0-b05b57321 modeling language!*/



// line 18 "Lab6.ump"
public class Account
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Account Attributes
  private int accountNumber;
  private int balance;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Account(int aAccountNumber, int aBalance)
  {
    accountNumber = aAccountNumber;
    balance = aBalance;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setAccountNumber(int aAccountNumber)
  {
    boolean wasSet = false;
    accountNumber = aAccountNumber;
    wasSet = true;
    return wasSet;
  }

  public boolean setBalance(int aBalance)
  {
    boolean wasSet = false;
    balance = aBalance;
    wasSet = true;
    return wasSet;
  }

  public int getAccountNumber()
  {
    return accountNumber;
  }

  public int getBalance()
  {
    return balance;
  }

  public void delete()
  {}

  // line 26 "Lab6.ump"
  public int checkBalance(){
    return balance;
  }

  // line 31 "Lab6.ump"
  public void addToBalance(int payment){
    balance += payment;
  }


  public String toString()
  {
    return super.toString() + "["+
            "accountNumber" + ":" + getAccountNumber()+ "," +
            "balance" + ":" + getBalance()+ "]";
  }
}