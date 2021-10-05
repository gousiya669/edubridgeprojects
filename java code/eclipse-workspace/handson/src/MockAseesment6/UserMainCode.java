package MockAseesment6;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserMainCode {
	
	public static String getNextMonthDay(String strDate)
        {
          String weekDay=null;
          //Insert code here to return the weekday of the starting date
          // of the next month of the given date.
          String array[]=strDate.split("/");
          int month=Integer.parseInt(array[1]);
          month++;
          String str=array[0]+"/"+String.valueOf(month)+"/"+array[2];
          SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
          SimpleDateFormat sdf1=new SimpleDateFormat("EEEE");
          sdf.setLenient(false);
          Date date=null;
          try {
        	  date=sdf.parse(str);
        	  weekDay=sdf1.format(date);
        	  
          }
          catch(ParseException p){
        	  p.printStackTrace();
          }
          return weekDay;
        }

} 

