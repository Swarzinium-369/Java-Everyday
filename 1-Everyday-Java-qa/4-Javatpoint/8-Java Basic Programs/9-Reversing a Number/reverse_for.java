public class reverse_for {
    public static void main(String args[]){
        int num = 1234;
        int len = String.valueOf(num).length();
        System.out.println("Total digits are " + len);
        int rem = 0, rev = 0;
        for(int i=len;i>0;i--){
            rem = num % 10;
            rev = 10*rev + rem;
            num /= 10;
        }
        System.out.println("Reversed number is " + rev);
    }
}
