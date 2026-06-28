class arraycount{
    public static void main(String args[]){
    int arr[]={1,2,3,4,5,6};
    int count=0;
    int eventcount=0;
    int oddcount=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
           eventcount++;
             
        }else{
            oddcount++;
              
            
        }
    }
     System.out.println(+eventcount);
     System.out.println(+oddcount);
}
}