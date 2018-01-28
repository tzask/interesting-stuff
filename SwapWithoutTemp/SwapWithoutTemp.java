/**
 * This class shows how to swap two numbers without using a temporary variable
 */
public class SwapWithoutTemp {
    public static void main(String[] args) {
        int x = 14, y = 6;

        /**Using XOR
         * 'x' (1110) and 'y' (0110)
         */
        x = x ^ y;  // x = 15 (1000)
        y = x ^ y;  // y = 10 (1110)
        x = x ^ y;  // x = 5 (0110)
        System.out.println("x = " + x + "; y = " + y);

        /**Using addition and subtraction
         * be careful, because addition may go out of Integer.MAX, if x and y become large enough
         */
        x = x + y; // x = 20
        y = x - y; // y = 14
        x = x - y; // x = 6
        System.out.println("x = " + x + "; y = " + y);
    }
}
