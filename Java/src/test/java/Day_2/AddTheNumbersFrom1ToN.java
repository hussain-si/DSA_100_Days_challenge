package Day_2;

public class AddTheNumbersFrom1ToN {
    public static int addNums(int n) {return n;
    }

    public static void main(String args[]) {
        int n = 3;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum =(n*(n + 1))/2;
        }
        assert addNums(n) == 6 : "Expect 6 for n = 3";
        System.out.println("All test cases in main git add  passed");
        System.out.println(sum);
    }
}
