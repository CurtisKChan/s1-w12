public class StringsLoopsMain{
    public static void main(String[] args) {
        new StringsLoops();

        StringsLoops n = new StringsLoops();

        String word = n.copy("Ian", 3);
        System.out.println(word);

        String word2 = n.interweaving("sean", "frog");
        System.out.println(word2);
    }
}