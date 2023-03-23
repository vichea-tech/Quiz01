package TP04;
import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;
        System.out.print("Please input 4 digits number: ");n=cin.nextInt();
        int n1=n/1000%10, n2=n/100%10, n3=n/10%10, n4=n%10;
        if(n>=1000 && n<=9999){
            System.out.print(n4);
            System.out.print(n3);
            System.out.print(n2);
            System.out.print(n1);
        }else{
            System.out.println("Is valid");
        }
    }
}
