import java.util.Scanner;
/** to find the power. **/
class Solution {
    /*
    Do not modify this main function.
    */
    private Solution() { }
    /**
     * @brief [brief description].
     * @details [long description].
     * 
     * @param String [description].
     */
    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int base = s.nextInt();
        int exponent = s.nextInt();
        long result = power(base, exponent);
        System.out.println(result);
    }
    /*
    Need to write the power function and print the output.
    */
    /**
     * @brief [brief description]
     * @details [long description]
     * 
     * @param int [base].
     * @param int [exponent].
     * 
     * @return [returning long].
     */
    static long power(final int base, final int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
        return base * power(base, exponent - 1);
        }

    }
}
