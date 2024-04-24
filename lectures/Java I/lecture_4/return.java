/* notes */
/* Variables can only exist in the scope that they were declared in.
We can use a value outside of the method it was created in if we return it from the method.

We return by using keyword return

The void keyword (which means "completely empty") indicates that no value is returned after calling that method

A non-void method returns a value when it is called.

When creating new methods, we used the keyword void. Here, we are replacing void with int, to signify that the return type is an int, or you can use any other data type that your method will return.

If the return expression is compatible with the return type, a copy of that value gets returned in a process known as return by value.
*/

public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }

  public String toString() {
    String description = "This store sells " + productType + " at a price of " + price + ".";
    return description;   
  }
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    Store cookieShop = new Store("Cookies", 5);
    System.out.println(lemonadeStand);
    System.out.println(cookieShop);
  }
}