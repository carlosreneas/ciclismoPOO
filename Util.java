
/**
 * Write a description of class Util here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Date;
import java.text.SimpleDateFormat; 

public class Util
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static Date toDate(String date)
    {
        try{
            return new SimpleDateFormat("dd/MM/yyyy").parse(date);
        }catch(Exception e) {
            return null;
        }
    }
}
