class Q1{
    public static void main(){
        int sum = 0;
        
        for(int i=0;i<1000;i++){
            if(i%3 == 0 || i%5 == 0){
                sum = sum  + i;
            }
        }
        
        System.out.println("Multiples of 3 and 5 below 1000 add up to " +sum);
    }
}
