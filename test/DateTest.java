
import main;

public class DateTest
{
	@Test
	public void validStringDateFormat()
	{
		assertEquals("12/03/19" ,new DateMain().toString());
	} 

	@Test
	public void invalidStringDateFormat()
	{
		assertEquals("03/12/19" , new DateMain().tostring());
	}

	

}