class MergeStringsAlternately {
	public static void main(String[] args){
		String word1 = "abcd";
		String word2 = "pq";
		System.out.println(mergeStrings(word1, word2));
	}

	public static String mergeStrings(String word1, String word2) {
		StringBuilder merged = new StringBuilder();
		int iterator = (word1.length() >= word2.length()) ? word1.length() : word2.length();
		for (int i=0; i<iterator; i++) {
			if (i < word1.length()) {
			merged.append(word1.charAt(i));
			}
			if (i < word2.length()) {
			merged.append(word2.charAt(i));
			}
		}
		return merged.toString();		
	}
}
