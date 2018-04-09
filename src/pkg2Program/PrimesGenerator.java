package pkg2Program;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimesGenerator {
    
    public static ArrayList CreateArray(int N){
        ArrayList array = new ArrayList();
        array.add(1);
        array.add(2);
        for(int i = 3; array.size() < N; i++) {
            if (isPrime(i)){
                array.add(i);
            }
        }
        
        return array;
    }
    
    private static boolean isPrime(int n){
        for(int i = 2; i< n;i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
}
