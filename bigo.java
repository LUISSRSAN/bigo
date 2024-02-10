class bigo {


    public void sumAndProdofArr(int []arry){
        int sum =0;
        int product = 1;
        for (int i =0;i<arry.length;i++){
            sum+=arry[i];
        }
        for (int i =0;i<arry.length;i++){
            product*=arry[i];
        }
        System.out.println(sum+", "+product);
    }

    public static void main(String[] args) {
        
        int [] customArray = {1,3,4,5};
        bigo bigo1 = new bigo();
        bigo1.sumAndProdofArr(customArray);

    }
}