package Task2;

public class Part2 {
    public static void main(String[] args) {
        //Task 2
        String str = "Given a string, find the number of words in it";
        int wordsNum = str.split(" ").length;
        System.out.println("Words: " + wordsNum);

        //Task3
        for(String word:str.split(" ")) {
            System.out.println(word + " = " + word.length());
        }
        //Task4
        int index = 1;
        System.out.println("The word with index " + index + " is: ");
        strIndex(index, str);
    }
    private static void strIndex ( int index, String str) {
        System.out.println("'" + str.split(" ")[index] + "'");
    }

}
