package HW1;
// Make a method that accepts a string an integer and a char and will return the string with the char
// replaced at the integer given
// charReplace("I MAKE BREAD",2,T)
// EX: I MAKE BREAD, 2, T
//     I TAKE BREAD
// remember computer counting starts at 0:
// HELLO
// 01234
public class Replace {
    public String charReplace(String s, int x, char z) {
        if (x >= s.length()) {
            return s;
        } else {
            String before = s.substring(0, x);
            String after = s.substring(x + 1);
            return before + z + after;
     }
    }
}
