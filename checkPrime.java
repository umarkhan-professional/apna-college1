import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number:");
        int num = sc.nextInt();
        int count=0;
        for(int i = 2;i<num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("It is a Prime Number");
        }
        else{
            System.out.println("It is not a prime Number");
        }
    }
}
