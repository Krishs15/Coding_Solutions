class Solution {
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st == null || st.isEmpty())
        return ;
        
        int top = st.pop();
        sortStack(st);
        Sorting(st, top);
    }
    
    private void Sorting(Stack<Integer> st, int element)
    {
        if(st.isEmpty() || st.peek() <= element)
        {
            st.push(element);
            return;
        }
        int large = st.pop();
        Sorting(st, element);
        st.push(large);
    }
}