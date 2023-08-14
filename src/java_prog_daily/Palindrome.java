package java_prog_daily;

    public class Palindrome {
        private String word;
    
        public Palindrome(String word) {
            this.word = word;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
    
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
    
            Palindrome other = (Palindrome) obj;
    
            return word.equals(other.word);
        }
    
        public static void main(String[] args) {
            Palindrome racecarPalindrome = new Palindrome("racecar");
            Palindrome helloPalindrome = new Palindrome("hello");
    
            System.out.println("Entered word is Palindrome? " + racecarPalindrome.equals(racecarPalindrome));
            System.out.println("Entered word is Palindrome? " + helloPalindrome.equals(helloPalindrome));
        }
    }
    
    
}
