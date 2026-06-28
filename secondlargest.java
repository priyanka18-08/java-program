class secondlargest{
    public static void main(String args[]){
        int arr[]={10,20,43,23};
        int largest=arr[0];
        int secondlar=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlar=largest;
                largest=arr[i];
            }
           else if(arr[i] > secondlar && arr[i] != largest) { 
            secondlar = arr[i];   

        }}
        System.out.println("Second largest number: " + secondlar);
    
}}