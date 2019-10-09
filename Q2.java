class Q2{
    public static void main(){
        int sum = 2;
        int a = 1;
        int b = 2;
        
     
            for(int i = 0; i<100 && a <4000000 || b<4000000;i++){
                a = a + b;
                b = b + a;
                if(a % 2 == 0) sum = sum + a;
                if(b % 2 == 0) sum = sum + b;
           
                System.out.print(a + " " + b + " ");
            }
        
        System.out.print("Your sum is "+ sum);
    }
}
