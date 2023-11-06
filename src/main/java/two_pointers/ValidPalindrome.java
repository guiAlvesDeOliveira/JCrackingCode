package two_pointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String formated = s.replace(" ", "");
        formated = formated.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        String comparator = "";
        for (int i = formated.length()-1; i >= 0; i--) {
            comparator += formated.charAt(i);
        }

        if (!comparator.equals(formated)) return false;
        return true;
    }
}
