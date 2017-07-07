public class RoundingError {
    public static void main( String args[ ] ) {
        double d = 2;

        // Math.sqrt( x ) calculates the square root of x
        d = Math.sqrt( 2 ); // d = 1.414...

        // Math.pow( a, b ) calculates a to the bth power
        d = Math.pow( d, 2 ); // d should store 2 again

        // System.out.println( d ) makes the value of d appear in the console
        System.out.println( d ); // Uh oh!
    }
}