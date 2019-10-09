class Q3 {
    public static void main(){
        double sum = 0;
        double sum2 = 0;
        double b = 0;
         for(int i=1;i<=100;i++){
             sum = sum  + Math.pow(i,2);
            }
            
         for(int a=1;a<=100;a++){
             sum2 = sum2 + a;
            }
            sum2 = Math.pow(sum2,2);
            
            b= sum2-sum;
            
            
            System.out.print((int) b);
    }
}