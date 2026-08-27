class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int read = 0;

        while (read < chars.length){
            char currChar =chars[read];
            int grpLength = 0;
        while (read < chars.length && chars[read] == currChar) {
                read++;
                grpLength++;
            }

            chars[write++] = currChar;
            if (grpLength > 1) {
                for (char c : Integer.toString(grpLength).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;


    }
}