public class Ex30_PatternMatch {
public static void main(String[] args) {
        printTypeInfo("Hello");
        printTypeInfo(42);
        printTypeInfo(3.14);
        printTypeInfo(true);
    }

    public static void printTypeInfo(Object obj) {
        if (obj instanceof Integer i) {
            System.out.println("It's an Integer: " + i);
        } else if (obj instanceof String s) {
            System.out.println("It's a String: " + s);
        } else if (obj instanceof Double d) {
            System.out.println("It's a Double: " + d);
        } else if (obj instanceof Boolean b) {
            System.out.println("It's a Boolean: " + b);
        } else {
            System.out.println("Unknown type");
        }
    }
}


