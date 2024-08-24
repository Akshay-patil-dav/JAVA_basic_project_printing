

public class Demo {
    public  static  void  main(String[] args){
//        Scanner a;
        int[] AA = new int[15] ;
//        AA[0] =1;


        for (int j =0; j<=10; j++){
            AA[j] = 2*(j+1);
        }

        for (int i=0; i<=10;i++) {
            System.out.println("AA["+i+"] =\t"+AA[i]);
        }
    }
}
