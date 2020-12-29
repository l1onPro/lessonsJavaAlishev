public class LessonsStrings {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        String str1 = "Hi", str2 = "my", str3 = "friend", strAll;
        long startTime = System.currentTimeMillis();
        strAll = str + str2 + str3;
        long timeSpend = System.currentTimeMillis() - startTime;
        System.out.println(timeSpend);


        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Hi");
        stringBuilder.append("my").append("friend"); //быстрее в 12 раз чем String: strAll = str + str2 + str3;
        timeSpend = System.currentTimeMillis() - startTime;
        System.out.println(timeSpend);


    }
}