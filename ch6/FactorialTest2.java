package ch6;

public class FactorialTest2 {
    static long factorial(int n){
        if(n > 20)
            return -1;
        if(n < 0)
            return -1;
        if(n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
    public static void main(String[] args){
        int n = 21;
        long result = 0;

        for(int i = 1; i <= n; i++){
            result = factorial(i);
            if(result==-1) {
                System.out.println("유효하지 않은 값입니다.");
                break;
            }
            System.out.println(result);
        }
    }
}
