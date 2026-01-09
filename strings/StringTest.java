package strings;

public class StringTest {
    public static void main(String[] args){
        // Strings are immutable

        // defining string
        String s1="Hello";

        // Any Object to String -> obj.toString()
        Integer num=100;
        String numString = num.toString();

        // Length -> s1.length() method
        int len=s1.length(); 

        // Concatenation
        String s2=s1+"thanks";

        // to get the character at particular index -> s.charAt(index)
        char ch=s1.charAt(1);

        // String to char array
        char[] charArray = s1.toCharArray();

        // Methods on strings
        // NOTE : When ever we apply string modification methods the string is not affected a new string is returned every time
        // as String is immutable

        // Substring -> similar to python slicing
        // s.substring(beginIndex) -> beginIndex to lastIndex
        s1.substring(2);
        
        // s.substring(beginIndex,endIndex] -> endIndex is excluded
        s1.substring(1,4);

        // equality
        boolean eq1=s1.equals(s2);

        // Compare
        int compareRes=s1.compareTo(s2); // this compareTo is overriden method as String implements Comparable

        int compareRes2=s1.compareToIgnoreCase(s2);

        // res < 0 -> s1 before s2
        // res = 0 -> s1 == s2
        // res > 0 -> s1 after s2

    }
}
