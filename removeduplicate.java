import java.util.*;
class removeduplicate{
    public static void main(String args[]){
        int arr[]={1,2,2,3,4,4,5};
        Set<Integer>set=new  LinkedHashSet<>();
        for(int i=0;i<arr.length;i++)
        set.add(arr[i]);
        System.out.print(set);
    }
}