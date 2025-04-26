package calculatorProjectOne;

import java.util.Scanner;

public class Main {
    //속

    //생

    //기
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        String as = "y";
        while (as.equals("y")) {
            System.out.println("첫번쩨 숫자 입력하세요.");
            int a = scanner.nextInt();

            System.out.println("두번쩨 숫자 입력하세요.");
            int b = scanner.nextInt();

            System.out.println("연산 기호를 입력하세요");
            String op = scanner.next();
            char in = op.charAt(0);

            if (in == '+') {
                int sum = a + b;
                System.out.println("결과 = " + sum);
            }
            if (in == '-') {
                int sud = a - b;
                System.out.println("결과 = " + sud);
            }
            if (in == '*') {
                int mul = a * b;
                System.out.println("결과 = " + mul);
            }
            if (in == '/') {
                if (b == 0) {
                    System.out.println("나눗셈 연산 기호에 '0' 을 쓸 수 없습니다.");

                } else {
                    int div = a / b;
                    System.out.println("div = " + div);
                }
            }
            System.out.println("계속 하려면 'y' 종료 하려면 'e'");
            as = scanner.next();
        }
        System.out.println("종료");
    }
}
