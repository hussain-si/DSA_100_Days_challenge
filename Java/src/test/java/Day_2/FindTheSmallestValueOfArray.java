package Day_2;

public class FindTheSmallestValueOfArray {
    static int smallestValueOfArray(int[] numbers, String toReturn) {
return 0;
    }

    public static void main(String args[]) {
        assert (1 == smallestValueOfArray(new int[] { 4, 2, 3, 1, 5 }, "value")) : "Expect 1 for numbers = [4, 2, 3, 1, 5] and toReturn = \"index\"";
        assert (3 == smallestValueOfArray(new int[] { 4, 2, 3, 1, 5 }, "index")) : "Expect 3 for numbers = [4, 2, 3, 1, 5] and toReturn = \"index\"";
        System.out.println("All test cases in main function passed");

    }
}
