import java.util.*;

class ValidParentheses {
	public static void main(String[] args) {
		System.out.println(isValid("[](){}"));
		System.out.println(!isValid("[])({}"));
		System.out.println(isValid("[(){}]"));
		System.out.println(!isValid(")[](){}"));
	}

	public static boolean isValid(String parentheses) {
		Map <Character, Character> mapper = new HashMap<>();
		mapper.put(']','[');
		mapper.put(')','(');
		mapper.put('}','{');
		Stack<Character> stack = new Stack<>();
			
		for (Character c : parentheses.toCharArray()) {
			if (mapper.containsValue(c)){	
				stack.push(c);
			} else if (mapper.containsKey(c)) {
				if (stack.empty() || (stack.pop()!=mapper.get(c))) {
					return false;
				}
			}		
		}
	return true;
	}
}
