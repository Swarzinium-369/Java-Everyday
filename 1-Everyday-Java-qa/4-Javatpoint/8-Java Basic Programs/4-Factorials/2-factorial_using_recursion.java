public class factorial_using_recursion {
    static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return (n*factorial(n-1));
        }
    }
    public static void main(String args[]){
        System.out.println(factorial(5));
        System.out.println(factorial(4));
    }
}