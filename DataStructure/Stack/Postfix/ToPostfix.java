import java.util.Stack;
import java.util.StringTokenizer;

public class ToPostfix {
    // 연산자의 우선순위를 반환하는 정적 메소드
    public static int precedence(char op) {
        if (op == '(') return 0;
        else if (op == '+' || op == '-') return 1;
        else if (op == '*' || op == '/') return 2;

        return -1;
    }

    // 중위 표기식을 후위 표기식으로 바꿔서 반환하는 정적 메소드
    public static String infixToPostfix(String infix) {
        StringTokenizer st = new StringTokenizer(infix, " ");
        StringBuilder postfix = new StringBuilder();
        Stack<String> stack = new Stack();

        while (st.hasMoreTokens()){
            String token = st.nextToken();
            
            // 연산자의 경우
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // 현재 연산자의 우선순위보다 높거나 같은 연산자는 모두 pop
                while (!stack.empty() && (precedence(token.charAt(0)) <= precedence(stack.peek().charAt(0)))) {
                    postfix.append(stack.pop() + " ");
                }
                // 하고 자신을 스택에 삽입
                stack.push(token);
            }
            // 왼쪽 괄호의 경우 무조건 스택에 삽입
            else if (token.equals("(")) {
                stack.push(token);
            }
            // 오른쪽 괄호의 경우 왼쪽 괄호를 만날 떄 까지 연산자 모두 pop
            else if (token.equals(")")) {
                while (!stack.empty()) {
                    if (stack.peek().equals("(")) {
                        stack.pop();
                        break;
                    }
                    else {
                        postfix.append(stack.pop() + " ");
                    }
                }
            }
            // 피연산자의 경우
            else {
                postfix.append(token + " ");
            }
        }

        while (!stack.empty()) {
            postfix.append(stack.pop() + " ");
        }

        return postfix.toString();
    }
}
