package notation;
import java.util.Stack;
public class infixToPostfix {

    //1. Append operand to string.
    //2. push '(' to stack.
    //3. if ')', then pop out from stack until '('
    //4. while loop for operator.

    static int precendence(char ch){
        switch(ch){
            case '+' : case '-' : return 1;
            case '*' : case '/' :return 2;
            case '^' : return 3;
            default : return -1;
        }
    }

    public static String infixtopostfix(String exp){
        StringBuilder result = new StringBuilder();
        Stack <Character> st = new Stack<>();
        for(char ch : exp.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                result.append(ch);
            }
            else if(ch == '('){
                st.push('(');
            }
            else if(ch == ')' ){
                while(!st.isEmpty() && st.peek() != '('){
                    result.append(st.pop());
                }
                st.pop(); // removes the '('.
            }
            else{
                while(!st.isEmpty() && precendence(st.peek())>=precendence(ch)){
                    result.append(st.pop());
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String infix = "A+B^(K+L)+P*Q";
        String postfix = infixtopostfix(infix);
        System.out.println(postfix);
    }
}
