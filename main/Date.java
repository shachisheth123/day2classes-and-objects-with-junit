package main;

public class Date
{

	private int date1;
	private int month;
	private int year;
	
	public Date(int date1 , int month , int year)
	{
	this.date1=date1;
	this.month=month;
	this.year=year;
	}

	public String toString()
	{
		Date date = Calendar.getInstance();
	 	DateFormat dateFormat = new SimpleDateFormat("dd/mm/yy ");  
                String strDate = dateFormat.format(date);  
                System.out.println("Converted String: " + strDate)
	}




}