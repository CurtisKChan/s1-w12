public class NumbersLoopsMain {
    public static void main(String[] args) {
        NumbersLoops n = new NumbersLoops();
        int sum = n.digitSum(3);
        System.out.println(sum);
        String rev = n.reverseNum2(462);
        System.out.println(rev);
        int reverse = n.reverseNum(567);
        System.out.println(reverse);
        int pal = n.palindromeCount(100,125);
        System.out.println(pal);
    }
}