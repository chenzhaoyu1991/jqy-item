package recursion;

public class Recursion {
    public static int f(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        return f(n-1) + f(n-2);
    }
    public static void main(String[] args) {
        int n = f(7);
        System.out.println(n);

    }
}

