
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
//        main.test();
        main.testMultipleGroup();
    }

    private void test() {
        String str = "0911-123456 02-12345678";
        // Directly test regex once
        System.out.println(Pattern.matches("09.*", str));


        // Reuse regex via pattern.compile()
        // Define regex syntax via Pattern
        String regex = "\\d{2}-\\d{8}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        // continues find all groups
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    private void testMultipleGroup() {
        String str = "abc123";
        // Reuse regex via pattern.compile()
        // Define regex syntax via Pattern
//        String regex = "(\\w+)(\\d+)";
        String regex = "([a-z]+)(\\d+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        // continues find all groups
        if (matcher.find()) {
            System.out.println(matcher.groupCount()); // =2 for (abc), (123)
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.start(1));
            System.out.println(matcher.start(2));
            System.out.println(matcher.end(1));
            System.out.println(matcher.end(2));
        }
    }
}
