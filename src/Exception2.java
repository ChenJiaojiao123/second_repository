import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
/**
 *@ClassName:Exception2
 *@Description:
 *@author Chenjiao
 *@date:2017年11月18日
 */
public class Exception2 {

	public Date change(String date) throws ParseException   //将“yyyy/mm/dd”形式的日期字符串转化为日期对象
	{
		DateFormat format=new SimpleDateFormat("yyyy/mm/dd");
		try
		{
			return new Date(format.parse(date).getTime());
		}
		catch(ParseException e)
		{
			e.printStackTrace();
			throw e;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception2 except=new Exception2();
		System.out.println("请输入一个日期（例如：2011/11/18):");
		Scanner in=new Scanner(System.in);
		String string=in.nextLine();
		try
		{
			System.out.println(except.change(string));
		}
		catch(ParseException e)
		{
			e.printStackTrace();
			System.out.println("您输入的日期格式不对");
		}	
	}
}
