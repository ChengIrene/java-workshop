package idv.workshop.homework;

public class ReverseString {

    public String doRevert(String input) {
        StringBuffer result = new StringBuffer();
        StackPractice stack = new StackPractice(100);

        // Step1. Read the string as chars one by one
        char[] chars = input.toCharArray();

        // Step2. Push those chars into the stack sequentially
        for(char c : chars) {
            stack.push(c);
        }

        // Step3. Pop all chars to form a new String
        while (!stack.isEmpty()) {
            result.append((char)stack.pop());
        }

        return result.toString();
    }
}
