// Import statement:
import java.util.ArrayList;
class PrimeDirective {
  
  // Add your methods here:
  public boolean isPrime(int number) {
    if(number <= 1) {
      return false;
    } else if(number == 2) {
      return true;
    }else {
      for(int i = 2; i < number; i++) {
        if(number % i == 0) {
          return false;
        }
      }
      return true;
    }
  }
  public ArrayList<Integer> onlyPrimes(int[] numbers) {
    ArrayList<Integer> onlyPrimes = new ArrayList<Integer>();
    for(int number : numbers) {
      if(isPrime(number)) {
        onlyPrimes.add(number);
      }
    }
    return onlyPrimes;
  }
  public static void main(String[] args) {

    PrimeDirective pd = new PrimeDirective();
    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
    System.out.println(pd.isPrime(7));
    System.out.println(pd.isPrime(28));
    System.out.println(pd.isPrime(2));
    System.out.println(pd.isPrime(0));
    
    System.out.println(pd.onlyPrimes(numbers));
  }  

}