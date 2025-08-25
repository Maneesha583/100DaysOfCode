public class ExpressionEvaluation {
	
	public static int evaluate(String exp) {
        Stack st = new Stack();
        for (char c : exp.toCharArray()) {
            if (Character.isDigit(c)) st.push(c - '0');
            else {
                int b = st.pop(), a = st.pop();
                if (c == '+') st.push(a + b);
                else if (c == '-') st.push(a - b);
                else if (c == '*') st.push(a * b);
                else if (c == '/') st.push(a / b);
            }
        }
        return st.pop();
    }


	public static void main(String[] args) {
		
		String infix = "(5+3)*(8-2)";
        String postfix = "53+82-*";  // correct postfix form
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + postfix);
        System.out.println("Result: " + evaluate(postfix));

	}

}
