
import java.util.Arrays;
public class question6 {

public void reverse(int[]array){
    for(int i=0;i<array.length/2;i++){
int other = array.length-i-1;
int temp = array[i];
array[i] = array[other];
array[other] = temp;

}
System.out.println(Arrays.toString(array));

}



    public static void main(String[] args) {
        question6 q6 = new question6();
        int[] customArray = {1,2,3,4,5};
        q6.reverse(customArray);

    }
}
