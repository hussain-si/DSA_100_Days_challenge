package Day_2;

import java.io.OptionalDataException;

public class CreateAPhoneNumber {
    public static String createPhoneNumber(int[] a) {return "";
    }

    public static void main(String args[]) {
        assert (createPhoneNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0}).equals("1234567890")) : "Expect 1234567890 for a = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]";
        System.out.println("All test cases in main function passed");
        CreateAPhoneNumber sol = new CreateAPhoneNumber();
        String solution = "";
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        for (int i = 0; i<a.length; i++){
            solution=solution+a[i];
        }
        System.out.println(solution);
    }
}
