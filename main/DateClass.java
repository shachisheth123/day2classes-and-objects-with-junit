package main;

import java.text.ParseException;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Locale;  

public class DateClass
{

	private int date1;
	private int month;
	private int year;
	
	public DateClass(int date1 , int month , int year)
	{
	this.date1=date1;
	this.month=month;
	this.year=year;
	}

	public String toString()
	{
		Date date = new Date();  
		formatter = new SimpleDateFormat("dd MMMM yyyy");  
   		 strDate = formatter.format(date);  
   		 //System.out.println("Date Format with dd MM yy : "+strDate);  
  		return strDate;
		
	}
	public boolean isSmaller(DateClass date1)
	{
		DateClass date2;
		
		if(date1<date2)
			rteurn true;
		else
			return false;

		
	}
	
	

}