package ecommerce

public class Customer{
public void walkin(){
 System.out.println("mansi is gng inside big bazar");
 
 }
 public void shop(){
  System.out.println("cust is shopping");
 }
 public void checkout(){
  Cashier mansiCashier=new Cashier();
  mansiCashier.estimate();
  }
 }
