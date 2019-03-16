package test;

import org.junit.Test;
import static org.junit.Assert.*;
import main.Vehicle;
import org.junit.Before;

public class VehicleTest
{

	Vehicle vehicle;
	Vehicle vehicle1;
	Vehicle vehicle2;

	@Before
	public void setUp()
	{
	vehicle=new Vehicle(10.2,30.2,"Rahul",1);
	vehicle1=new Vehicle(15.0,20.2,"Rakesh",2 );
	vehicle2=new Vehicle(11.2,35.2,"Ramesh" ,3);
	}

	@Test
	public void testGetSpeed1()
	{
	assertEquals(10.2,vehicle.getCurrentSpeed(),10.2);
	}
	
	@Test
	public void testGetSpeed2()
	{
	assertEquals(15.0,vehicle1.getCurrentSpeed(),0.5);
	}
	
	@Test
	public void testGetSpeed3()
	{
	assertEquals(11.2,vehicle2.getCurrentSpeed(),0.3);
	}

	@Test
	public void testGetDirection()
	{
	assertEquals(30.2,vehicle.getCurrentDirection(),30.2);
	}

	@Test
	public void testGetDirection1()
	{
	assertEquals(20.2,vehicle1.getCurrentDirection(),0.5);
	}
	
	@Test
	public void testGetDirection2()
	{
	assertEquals(35.2,vehicle2.getCurrentDirection(),0.3);
	}

	@Test
	public void testGetName()
	{
	assertEquals("Rahul",vehicle.getOwnerName());
	}
	
	@Test
	public void testGetName1()
	{
	assertEquals("Rakesh",vehicle1.getOwnerName());
	}

	@Test
	public void testGetName2()
	{
	assertEquals("Ramesh",vehicle2.getOwnerName());
	}

	@Test
	public void testGetVehicleId()
	{
	assertEquals(1,vehicle.getVehicleId());
	}

	@Test
	public void testGetVehicleId1()
	{
	assertEquals(2,vehicle1.getVehicleId());
	}
	
	@Test
	public void testGetVehicleId2()
	{
	assertEquals(3,vehicle2.getVehicleId());
	}

	@Test
	public void testChangeSpeed()
	{

	assertEquals(50, vehicle.changeSpeed(50),0.2);
	System.out.println("Changed speed is" +vehicle.getCurrentSpeed());
	
	}
	
	@Test
	public void testStopVehicle()
	{
	assertEquals(0,vehicle.stopSpeed(), 0.0);
	System.out.println("speed is" +vehicle.stopSpeed());
	}
	
	/*@Test
	public void testTurnDirection()
	{
	assertEquals();
	}*/

	/*@Test
	public void testHighestIdentification()
	{
	
	assertEquals()
	}*/

}
