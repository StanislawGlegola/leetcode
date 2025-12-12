public class PalindromeNumber{
	public static void main(String [] args){
		int cfp = -12321;
		cfp = (cfp<0) ? cfp=cfp*(-1) : cfp;
		System.out.println(isPalindrome(cfp));

	}
	public static boolean isPalindrome(int palindrome){
		int reversedPalindrome = reverse(palindrome);
		System.out.println(reversedPalindrome);
		boolean result = (palindrome == reversedPalindrome) ? true : false;
		return result;
	}
	public static int reverse(int palindrome){
		int reversedPalindrome = 0;
		int result = 0;
		while (palindrome > 0) {
			result = palindrome % 10;
			reversedPalindrome = reversedPalindrome * 10 + result;
			palindrome = palindrome / 10;
		}
		return reversedPalindrome;
	}

}
