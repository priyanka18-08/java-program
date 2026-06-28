class palindrome{
    public static void main(String args[]){
        String str="madam";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
        rev=rev+str.charAt(i);}
        if(rev.equals(str)){
            System.out.print("palindrome");
        }
        else{
            System.out.print(" not palindrome");

        }
    }
}