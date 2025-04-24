package calculatorProjectOne;

import java.util.Scanner;

public class Main {
    //속

    //생

    //기
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 정수를 입력하세요. :");
        int a = scanner.nextInt();


        System.out.println("두 번째 정수를 입력하세요. :");
        int b = scanner.nextInt();

        System.out.println("사칙연산 기호를 입력하세요. :");
        String input = scanner.next();
        char op = input.charAt(0);
    }

    if (op == '+') {
        int sum = a + b;
        System.out.println("sum = " + sum);
    }
}
