class rev{
    public static void main(String args[]){
        String str="priyanka";
        String reversed="";
        //String reversed=new StringBuilder(str).reverse().toString();
        //System.out.println(reversed);
        for(int i=str.length()-1;i>=0;i--){
            reversed=reversed+str.charAt(i);
        }
        System.out.println(reversed);

    }
}