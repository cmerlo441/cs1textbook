/**
 * Determines the longer of two Strings.
 */
public class LongerString {
    public static void main( String args[] ) {
        String s1;
        String s2;
        int longer;

        s1 = new String( "This is a long string." );
        s2 = new String( "This one's shorter." );
        if( s1.length() > s2.length() )
            longer = s1.length();
        else
            longer = s2.length();

        // add output statement
    }
}
