class largest{
    public static void main (String args[]){
        int arr[]={10,9,6,4,20};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
            
System.out.print(+max);
        
    
    }
}