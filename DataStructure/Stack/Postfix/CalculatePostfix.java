import java.util.StringTokenizer;
import java.util.Stack;

public class CalculatePostfix {
    // 중위 표기식을 매개변수로 전달하면 계산 결과를 반환하는 정적 메소드
    public static double calculate(String postfix) {
        StringTokenizer st = new StringTokenizer(postfix, " ");
        Stack<Double> stack = new Stack();
        double e1, e2;

        while (st.hasMoreTokens()) {
            String token = st.nextToken();

            // 연산자의 경우
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                e2 = stack.pop();
                e1 = stack.pop();
            
                switch (token) {
                    case "+":
                        stack.push(e1 + e2);
                        break;
                    case "-":
                        stack.push(e1 - e2);
                        break;
                    case "*":
                        stack.push(e1 * e2);
                        break;
                    case "/":
                        stack.push(e1 / e2);
                        break;
                }
            }
            
            // 피연산자의 경우
            else {
                stack.push(Double.parseDouble(token));
            }
        }

        return stack.pop();
    }
}
