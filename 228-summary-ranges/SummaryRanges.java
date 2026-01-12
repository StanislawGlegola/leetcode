import java.util.*;

class SummaryRanges {
	public static void main(String[] args) {
		int[] array = {0,1,4,5,7};
		System.out.println(createRanges(array));
	}

	public static List<String> createRanges(int[] array){
		List<String> answer = new ArrayList<>();
		int i = 0;
		int n = array.length;
		
		while (i < n) {
			int start = array[i];
			while (i < n -1 && array[i]+1 == array[i+1]) {
				i++;
			}

			if (start != array[i]) {
				answer.add(start + "->" + array[i]);
			} else {
				answer.add(String.valueOf(array[i]));
			}
			i++;
		}
		return answer;
			
	}
}
