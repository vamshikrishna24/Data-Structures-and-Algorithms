// Evalutaing a given expression code

import java.util.*;

class EvaluatingExpression{

    public static boolean isBalanced(String input)
    {
        Stack<Character> stk = new Stack<>();
        for(char ch : input.toCharArray())
        {
            if(isLeftBracket(ch))
                stk.push(ch);
            if(isRightBracket(ch))
            {
                if(stk.empty()) return false;

                var top = stk.pop();
                if(bracketsNotMatch(top, ch))   return false;
            }
        }
        return stk.empty();
    }
    public static boolean isLeftBracket(char ch)
    {
        var leftBracket = Arrays.asList('(','<','{','[');
        return leftBracket.contains(ch);
    }

    public static boolean isRightBracket(char ch)
    {
        var rightBracket = Arrays.asList(')','>','}',']');
        return rightBracket.contains(ch);
    }

    public static boolean bracketsNotMatch(char left,char right)
    {
        return ((right==')' && left!='(')||
        (right=='>' && left!='<')||
        (right=='}' && left!='{') ||
        (right==']' && left!='['));
    }

    public static void main(String[] args) {
        //(1+2)
        //(1+2>
        String str = "(1+2)(";
        var res = isBalanced(str);
        System.out.println(res);
        
    }
}