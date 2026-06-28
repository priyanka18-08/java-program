class copy{
    public static void main(String args[]){
        int arr[]={1,5,3,7,8};
        int same[]=new int[arr.length];
    for(int i=0;i<arr.length;i++){
        same[i]=arr[i];
    }for(int num:same){
        System.out.print(num);
    }
    }
    }