package Luke8;

import java.util.ArrayList;

public class bruteForce {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int number = 1; number < 10001;number++) {
            if (sumDivisor(findDivisor(number)) == number) {
                result.add(number);
            }
        }

        System.out.println(System.currentTimeMillis() - startTime);
        print(result);
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
