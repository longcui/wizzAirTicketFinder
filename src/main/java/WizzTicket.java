import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by dragon on 26-Feb-16.
 */
public class WizzTicket {

    //processTicketData
     public static void main(String[] args) {
         try {
             URL url = new URL("https://cdn.static.wizzair.com/en-GB/TimeTableAjax?departureIATA=SVG&arrivalIATA=SZZ&year=2016&month=3");
             URLConnection urlConnection = url.openConnection();
             Object content = urlConnection.getContent();
             System.out.println(content);
         } catch (MalformedURLException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
}
