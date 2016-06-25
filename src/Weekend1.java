
/**
 * Created by sunil on 6/25/16.
 */
public class Weekend1 {

    public static void main(String[] args){
        /** Question 1 **/
        System.out.println(dist10(11,24));
        System.out.println(dist10(9,11));

        /** Question 2 **/
        System.out.println(charSwap("pterodactyl"));

        /** Question 3 **/
        System.out.println(notString("not nutella"));
        System.out.println(notString("motorcycle"));

        /** Question 4 **/
        System.out.println(sleepIn(false,false));
        System.out.println(sleepIn(true,false));
        System.out.println(sleepIn(false,true));

        /** Question 5 **/
        System.out.println(sumDouble(2,2));
        System.out.println(sumDouble(7,11));

    }

    /** Question 1 **/
    public static int dist10(int a, int b){
        int aDist = Math.abs(a-10);
        int bDist = Math.abs(b-10);

        if(aDist == bDist)
            return 0;
        else if (aDist > bDist)
            return b;
        else return a;
    }

    /** Question 2 **/
    public static String charSwap(String s){
        char[] swapper = s.toCharArray();
        char front = swapper[0];
        char back = swapper[swapper.length-1];

        //System.out.println(front);
        //System.out.println(back);

        swapper[0] = back;
        swapper[swapper.length-1] = front;
        String swapped = new String(swapper);
        return swapped;
    }

    /** Question 3 **/
    public static String notString(String s){
        if(s.startsWith("not") || s.startsWith("not ")) {
            s.concat("not ");
            return s;
        }
        else {
            String notString = "not " + s;
            return notString;
        }
    }

    /** Question 4 **/
    public static boolean sleepIn(boolean weekday, boolean vacation){
        if(!weekday && !vacation)
            return true;
        else if(weekday && !vacation)
            return false;
        else if(!weekday && vacation)
            return true;
        else return true;
    }

    /** Question 5 **/
    public static int sumDouble(int a, int b){
        if(a == b)
            return (2*a + 2*b);
        else return a + b;
    }
}
