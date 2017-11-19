import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
/**
 *@ClassName:Exception2
 *@Description:
 *@author Chenjiao
 *@date:2017��11��18��
 */
public class Exception2 {

	public Date change(String date) throws ParseException   //����yyyy/mm/dd����ʽ�������ַ���ת��Ϊ���ڶ���
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
		System.out.println("������һ�����ڣ����磺2011/11/18):");
		Scanner in=new Scanner(System.in);
		String string=in.nextLine();
		try
		{
			System.out.println(except.change(string));
		}
		catch(ParseException e)
		{
			e.printStackTrace();
			System.out.println("����������ڸ�ʽ����");
		}	
	}
}
