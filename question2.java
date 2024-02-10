//create a function which prints to the console the pairs from given array 
//find the time complexity


class question2{




    public void pairOfArray(int []array){
        for (int i =0;i<array.length;i++){

            for (int j=0;j<array.length;j++){
System.out.println(array[i]+", "+ array[j]);

            }
        }

    }
    public static void main(String[] args) {
        question2 q2 = new question2();

        int[] customArray = {1,2,3,4,5};
        q2.pairOfArray(customArray);

    }
}