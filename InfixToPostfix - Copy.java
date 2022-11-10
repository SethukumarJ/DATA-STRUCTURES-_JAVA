import java.util.Stack;

public class InfixToPostfix {

    Stack<Character> stack = new Stack<>();

    private int precedence(char character) {
        switch (character) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
        }
        return 0;
    }

    public void infixToPostfix(String exp) {
        String finalExp = "";
        for (int i = 0; i < exp.length(); i++) {
            char temp = exp.charAt(i);

            if (Character.isLetterOrDigit(temp)) {

                finalExp += temp;
            } else if (!Character.isLetterOrDigit(temp)) {
                if(temp == ')'){
                    while(stack.peek() != '('){

                       finalExp +=  stack.pop();
                    }
                    finalExp += stack.pop();
                    finalExp += ')';
                }

            }
           
            else if(stack.isEmpty()){
                stack.push(temp);
            }
            else if(precedence(temp)> precedence(stack.peek())){
                stack.push(temp);
            }
            else {
                while(!stack.isEmpty() && precedence(temp)<= precedence(stack.peek()) )
                {
                    finalExp += stack.pop();

                }
                stack.push(temp);
            }

        }
        while(!stack.isEmpty()){
            finalExp += stack.pop();
        }
    System.out.println(finalExp);
    }

   

    public static void main(String[] args) {
        InfixToPostfix me = new InfixToPostfix();


        me.infixToPostfix("(a+b^x)*(c+d)");
    }

}
