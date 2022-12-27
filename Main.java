public class Main {
    static void min(int arry[]){

        int min= arry[0];
        for(int i=1;i<arry.length;i++ ){
            if(min>arry[i])
                min =arry[i];
            System.out.println(min);
        }
    }


    public static void main(String[] args) {


        int a[] = {1,2,3,4};
       min(a);





    }
}
