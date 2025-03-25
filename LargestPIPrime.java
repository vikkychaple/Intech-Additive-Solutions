// Write a piece of code to find the largest 5 digit prime number in the first 100 digits of Pi? 


// - I search for the 100 pi digits on google exclude the 3 which 
// is prior the decimal point then from that all 100 digit extract the 5-digit numbers in a sequence.
//  Then check each digit is prime and then store it into result. 
// And display the output as largest prime found from 100 digits of pi.
public class LargestPiPrime{
  
    public static void main(String args[]){
        String piValue="1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";//100 pi digit
        int largestPrime=0;// initialize largest prime to 0
        for(int i=0;i<=piValue.length()-5;i++){//iterate for 5 digits
            int n=Integer.parseInt(piValue.substring(i,i+5));//string to int parsing
            if(isPrime(n) && n>largestPrime){
                largestPrime=n;
            }
        }
        System.out.println("Largest 5 digit prime number from 100 digits of pi:"+largestPrime);
    }
      static boolean isPrime(int n){
        if(n<2){
            return false;
            
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
           
        } return true;
    }
}
