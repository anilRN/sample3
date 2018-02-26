package Parser;

	import java.util.List;
	import java.util.Scanner;
	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.util.ArrayList;
	import java.util.Iterator;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class SampleParserTime {
		public static void main(String args[]) throws Exception
		{
			//FileReader file=new FileReader("/home/anil/Downloads/kubera.01-12-2017.log");
			BufferedReader file= new BufferedReader(new FileReader("/home/anil/kubera.01-12-2017.log"));
			String regex="INFO([\\s]+)([\\d]+)([\\s]+)([\\d]+[-][\\d]+[-][\\d]+)([\\s]+)([\\d]+[:][\\d]+[:][\\d]+)([\\s]+)\\[MarkTransactionCompleted\\]([ a-zA-Z]+)\\[perfiosTransactionId=([A-Z0-9]+)]";
	
		   
			//StringBuffer s=new StringBuffer();
			Pattern pattern=Pattern.compile(regex);
			String a;
			
			
			List<RecordDetails> records=new ArrayList<RecordDetails>();
			while((a=file.readLine())!=null)
		    {
				Matcher matcher=pattern.matcher(a);
				if(matcher.find())
				{
					RecordDetails recorddetails=new RecordDetails();
					recorddetails.setTransactionId(matcher.group(9));
					recorddetails.setDate(matcher.group(4));
					recorddetails.setTime(matcher.group(6));
					records.add(recorddetails);
					
				}
		    }
			//System.out.println(records.size());
			System.out.println("TransactionId\t\tDate\t\tTime");
			for(RecordDetails s:records)
			{
				s.PrintRecord();;
				
			}
			System.out.println(records.size());
				
			}

	}


