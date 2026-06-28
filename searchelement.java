 class searchelement {
    public static void main(String[] args) {
        int[] arr = {1, 5, 15, 20};
        int target = 15;
        int i;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                break;
            }
        }if (i == arr.length); {
            System.out.println("Element not found");
        }
    }
}