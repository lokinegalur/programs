class Balanced_Parenthesis
{

    //Function to check if brackets are balanced or not.
    
static boolean ispar(String str)
    {

        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch=='[' || ch=='{' || ch=='(')

                s.push(ch);

            else{

                if(s.isEmpty())

                    return false;

                char top = s.peek();

                if(top=='[' && ch==']')

                    s.pop();

                else if(top=='{' && ch=='}')

                    s.pop();

                else if(top=='(' && ch==')')

                    s.pop();

                else
 
                    return false;

            }

        }

        if(s.isEmpty())

            return true;

        else

            return false;

    }

}