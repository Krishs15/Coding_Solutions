class Solution {
    public boolean isValid(String s) {
        if(s == null || s.length() % 2 != 0)
        return false;

        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i=0 ; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                char top = stack.pop();
                if(!matches(top, c))
                {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean matches(char open, char close)
    {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }
}