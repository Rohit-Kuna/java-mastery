package collection.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingArrayDeque {
    public static void main(String[] args){
        Deque<Integer> s1=new ArrayDeque<>();
        
        /* SIZE */
        s1.size(); // O(1)

        // isEmpty
        s1.isEmpty();
        
        s1.push(3);
        s1.pop();
        s1.peek();

        // equality
        s1.equals(s1);

        // traverse
        s1.push(5);s1.push(10);s1.push(20);
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }

    }
}
