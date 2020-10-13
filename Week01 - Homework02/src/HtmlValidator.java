import java.util.Queue;
import java.util.Stack;

/*
 * SD2x Homework #2
 * Implement the method below according to the specification in the assignment description.
 * Please be sure not to change the method signature!
 */

public class HtmlValidator {
	
	public static Stack<HtmlTag> isValidHtml(Queue<HtmlTag> tags) {

		/* IMPLEMENT THIS METHOD! */
		Stack<HtmlTag> stack = new Stack<>();
		
		for (HtmlTag tag : tags) {
			if (tag.isOpenTag()) {
				stack.push(tag);
			} 
			else {
				if (!tag.isSelfClosing()) { 
					if (stack.isEmpty()) { 
						return null;
					}					
					if (tag.matches(stack.peek())) {
						stack.pop();
					} 
					else {  
						return stack;
					}
				}
			}
		}
		
		return stack; 
	}
	
}

