package test;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import day3.Country;

public class CountryTest {

	Country country[];
	

	
	@Before
	public void setUp()
	{
		country=new Country[3];
		country[0]=new Country("India" , 8759600 , 10123988);
		country[1]=new Country("America" , 779600 , 1023988);
		country[2]=new Country("NewZealand" , 67960 , 103988);
		
	}
	
	@Test
	public void testLargestArea()
	{
		Country expectedCountry=new Country("India" , 8759600 , 10123988);
		Country actualCountry=new Country().largestCountryArea(country);
		assertEquals(expectedCountry.getCountryName(), actualCountry.getCountryName());
		
	}
	
	@Test
	public void testLargestPopulation()
	{
		Country expectedCountry=new Country("India" , 8759600 , 10123988);
		Country actualCountry=new Country().largestCountryPopulation(country);
		assertEquals(expectedCountry.getCountryName(), actualCountry.getCountryName());
		
	}
	
	@Test
	public void testLargestPopulationDensity()
	{
		Country expectedCountry=new Country("America" , 779600 , 1023988);
		Country actualCountry=new Country().largestPopulationDensity(country);
		assertEquals(expectedCountry.getCountryName(), actualCountry.getCountryName());
		
	}

}