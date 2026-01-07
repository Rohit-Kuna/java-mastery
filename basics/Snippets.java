package basics;

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Snippets{
    public static void main(String[] args){
        
        // max in array
        int[] arr={1,23,30,14,5};
        System.out.println(getMax(arr));

        // similarly sum

        // In 2D array sort by 1st value asc
        int[][] matrix={{11,2},{2,3},{6,8}};
        Arrays.sort(matrix,(a,b)->Integer.compare(a[0],b[0]));

        // Convert array to stream
        IntStream intStream=Arrays.stream(arr);
        Stream<Integer> integerStream=Arrays.stream(arr).boxed();

        // what is boxed and mapToInt
        
    }

    static int getMax(int[] arr){
        int res=Integer.MIN_VALUE;
        for(int p:arr){
            if(p>res){
                res=p;
            }
        }
        return res;
    }
}
