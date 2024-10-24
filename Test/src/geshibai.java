import java.sql.SQLOutput;
import java.util.Scanner;

public class geshibai {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int a=number/100;
        int b=(number%100)/10;
        int c=number-a*100-b*10;
        System.out.println("百位"+a);
        System.out.println("十位"+b);
        System.out.println("个位"+c);


    }
}
