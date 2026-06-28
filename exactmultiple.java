import java.util.Scanner;
class exactmultiple{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the N:");
        int N=sc.nextInt();
         System.out.println("enter the M:");
         
        int M=sc.nextInt();
        if(N%M==0){
            System.out.print("YES");}
            else{
                System.out.print("NO");
            }

        
    }
}