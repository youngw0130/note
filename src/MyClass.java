import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇줄을 출력하시겠습니까? ");
        int a = sc.nextInt();
        for(int i = 0; i < a; i++) {
            for(int j = 0; j <= i; j++) {
                if(j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print("@");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}