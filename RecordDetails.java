package Parser;

public class RecordDetails {
	
	String TransactionId;
	
	String Date;
	
	String Time;
	
	public String getDate() {
		return Date;
	}
	
	public void setDate(String date) {
		Date = date;
	}
	
	public String getTime() {
		return Time;
	}
	
	public void setTime(String time) {
		Time = time;
	}
	
	public String getTransactionId() {
		return TransactionId;
	}
	
	public void setTransactionId(String transactionId) {
		TransactionId = transactionId;
	}
	
	public void PrintRecord()
	{
		System.out.println(TransactionId+"\t"+Date+"\t"+Time);
	}
	
	
	

}
