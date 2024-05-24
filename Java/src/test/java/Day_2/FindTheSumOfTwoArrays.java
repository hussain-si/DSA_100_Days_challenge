package Day_2;

public class FindTheSumOfTwoArrays {
    public static int sumOfTwoArrays(int[] arr1, int[] arr2) {return 0;
    }

    public static void main(String args[]) {
        assert (sumOfTwoArrays(new int[] { 1, 2, 3 }, new int[] { 4, 5, 6,4 }) == 21) : "Expect 21 for {1,2,3},{4,5,6}";
        System.out.println("All test cases in main function passed");
        int sum = 0;
        int[] arr1 = new int[] { 1, 2, 3 };
        int[] arr2 = new int[] { 4, 5, 6,4 };
        for (int i = 0; i<arr1.length; i++){
            sum =sum + arr1[i]+arr2[i];
        }
        System.out.println(sum);
    }
}
