package Luke8;

import java.util.ArrayList;

public class mathMagic {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int n=1, lastPerfect = 0, possiblePrime = 0;
        ArrayList<Integer> perfectNumbers = new ArrayList<Integer>();
        do{
            possiblePrime = mersennePrime(n++);
            if(isPrime(possiblePrime) && isPerfectNumber(possiblePerfectNumber(possiblePrime))) {
                perfectNumbers.add(possiblePerfectNumber(possiblePrime));
            }
        }while(possiblePerfectNumber(possiblePrime) < 10000);


        System.out.println(System.currentTimeMillis() - startTime);
        print(perfectNumbers);
    }


    public static boolean isPerfectNumber(int number){
        if(sumDivisor(findDivisor(number)) == number){
            return true;
        }else{
            return false;
        }
    }


    public static int mersennePrime(int n){
            return 2^n-1;
    }

    public static int possiblePerfectNumber(int p){
        return p*(p+1)/2;
    }


    public static boolean isPrime(long n) {
        if (n <= 3) {
            return n > 1;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        } else {
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static ArrayList<Integer> findDivisor(int tall){
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        for(int n = 1; n < tall; n++){
            if(tall % n == 0){
                divisors.add(n);
            }
        }
        return divisors;
    }

    public static int sumDivisor(ArrayList<Integer> list){
        int sum = 0;
        for(int i = 0; i < list.size();i++){
            sum += list.get(i);
        }
        return sum;
    }

    public static void print(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+ ", ") ;
        }
    }
}
