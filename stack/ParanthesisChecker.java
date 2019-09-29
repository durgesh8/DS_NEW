package stack;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesisChecker{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
           char[] arr=input.toCharArray();
           Stack<Character> st=new Stack<>();
           boolean flag=true;
           for(int i=0;i<arr.length;i++){
               if(arr[i]=='(' || arr[i]=='{' || arr[i]=='[') {
            	   st.push(arr[i]);
            	   continue;
               }
              
             if(arr[i]=='}'){
                       if(!st.isEmpty() && st.peek()=='{')
                       st.pop();
                       else{
                            flag=false;
                       break;
                       }
                   }
             if(arr[i]==']'){
                       if(!st.isEmpty() && st.peek()=='[')
                       st.pop();
                       else{
                    	   flag=false;
                       break;
                       }
                   }
             if(arr[i]==')'){
                       if(!st.isEmpty() && st.peek()=='(')
                       st.pop();
                       else{
                    	   flag=false;
                       break;
                       }
                   }
               }
           if(flag) {
        	   if(st.isEmpty())
        		   System.out.println("true");
        	   else
        		   System.out.println("false");
           }else {
        	   System.out.println("false");
           }
              
               
           }
		}
		
}



