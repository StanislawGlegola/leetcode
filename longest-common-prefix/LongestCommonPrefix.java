class LongestCommonPrefix {
	public static void main (String[] args) {	
		String [] data = {"flower", "flow", "flight"};
		String result = longestCommonPrefix(data);
		System.out.println(result);
	}

	public static String longestCommonPrefix(String[] data){
		if (data==null || data.length==0) { return ""; }
		
		String prefix = data[0];

		for (int i = 1; i < data.length; i++) {
			while (!array[i].startsWith(prefix)) {
				prefix = prefix.substring(0, data.length-1);
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}
		return prefix;
	}
}
