package Old;

public class RecursionInString {
    public static void main(String[] args) {
        String s = "abcba";
        isPalindrome(s,0,s.length() - 1);
    }
    static String RemoveOccurrences(String s , int idx) {
        if(idx == s.length()) return ""; //base case
        String smallAns = RemoveOccurrences(s ,idx + 1); //recursive work
        char currChar = s.charAt(idx); //self work
        if(currChar == 'a'){     //occurrence to be removed
            return smallAns;
        } else{
            return currChar + smallAns;
        }
    }
    static String Reverse(String s , int idx){
        if(idx == s.length()) return "";
        String smallAns = Reverse(s , idx+1);
        return smallAns + s.charAt(idx);
    }
    static void PalindromeFromReverse(String s ){
        String str = Reverse(s , 0);
        if(str.equals(s)){
            System.out.println("palindrome");
        } else{
            System.out.println("not palindrome");
        }
    }
    static boolean isPalindrome(String s , int l , int r){
        if(l >= r) return true;
        return (s.charAt(l) == s.charAt(r) && isPalindrome(s,l+1 ,r-1 ));
    }

    
}