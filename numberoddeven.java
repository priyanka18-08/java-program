class numberoddeven{
    public static void main(String args[]){
        int num=53467;
        int evencount=0;
        int oddcount=0;
        while(num>0){
            int digit=num%10;
            if(digit%2==0){
                evencount++;
            }else{
                oddcount++;
            }num=num/10;

            
        }System.out.println("even:"+evencount);
        System.out.println("odd:"+oddcount);

    }
}