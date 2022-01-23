import java.util.Scanner;

public class PostfixMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("중위 표기식 입력: ");
        String postfix = ToPostfix.infixToPostfix(scanner.nextLine());

        System.out.println(postfix);
        
        double result = CalculatePostfix.calculate(postfix);
        System.out.println("결과: " + result);

        scanner.close();
    }
}
