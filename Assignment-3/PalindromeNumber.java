class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        int original = x;
        int reversed = 0;

        if (x < 0) {
            System.out.println(false);
            return;
        }

        while (x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x = x / 10;
        }

        System.out.println(original == reversed);
    }
}
