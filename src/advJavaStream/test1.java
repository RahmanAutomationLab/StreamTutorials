package advJavaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {

	//Count the number of names starting with alphabet A in list
	@Test
	public void regular()
	{
	ArrayList<String> names=new ArrayList<String>();
	names.add("Abhijeet");
	names.add("Don");
	names.add("Alekhya");
	names.add("Adam");
	names.add("Ram");
	int count=0;
	
	for(int i=0;i<names.size();i++)
	{
		String actual=names.get(i);
		if(actual.startsWith("A"))
		{
			count++;
		}
	}

	System.out.println("regular way : "+count);	
			
	}
	
	@Test
	public void streamFiles() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		/* there is no life for intermediate op if ther is no terminal op
		 * terminal operations will execute only if inter op (filter) reterns true
		 * we can create stream 
		 * how to use filter in Stream API
		 */
		Long c=names.stream().filter(s->s.startsWith("A")).count();
		System.out.println("Stream way : " +c);
		
		long d =Stream.of("Abhijeet", "Don","Alekhya","Adam","Ram","Sam").filter(s->{
			
			s.startsWith("A");
			return true;
		}).count();
		System.out.println("~~~~~ :" +d);
		
		// print all the names if ArrayList
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println("_"+s));
		
		
	}
}

