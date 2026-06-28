class duplicates {
    public static void main(String args[]) {
        String str = "priyanka";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if this character appeared before
            if (str.indexOf(ch) != i) {
                // Skip, because we already counted it
                continue;
            }

            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(ch);
            }
        }
    }
}