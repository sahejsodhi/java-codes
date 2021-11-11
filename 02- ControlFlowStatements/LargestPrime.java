public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        }
        if ((number == 0) || (number == 1)) {
            return -1;
        }
        int prime = -1;
        int count = 0;
        for(int i = 2;i<=number;i++) {
            if (number%i==0) {
                for(int j = 2;j<i;j++) {
                    if(i%j==0) {
                        count++;
                    }
                    
                }
                if (count == 0) {
                        prime = i;
                    }
            }
        }
        return prime;
        
    }
}
