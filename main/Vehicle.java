package main;


public class Vehicle
{
	private	double currentSpeed;
	private double currentDirection;
	private String ownerName; 
	static int highestVehicleIdentificationNumber=0;
	private int vehicleId;
	public final static String TURN_LEFT="TURN_LEFT";
	public final static String TURN_RIGHT="TURN_RIGHT";
	private double degree;
	


		//constructor
	public Vehicle()
	{
	this.vehicleId=++highestVehicleIdentificationNumber;
	}

	public Vehicle(double currentSpeed,double currentDirection,String ownerName)
	{
	this();
	this.currentSpeed=currentSpeed;
	this.currentDirection=currentDirection;
	this.ownerName=ownerName;
	
	}

	public Vehicle(String ownerName)
	{	
	this.ownerName=ownerName;
	}

	public double getCurrentSpeed()
	{
		return currentSpeed;
	}
	
	public double getCurrentDirection()
	{
		return currentDirection;
	}	
	
	public String getOwnerName()
	{
		return ownerName;
	}

	public int getVehicleId()
	{
		return vehicleId;
	}

	public double changeSpeed(double speed)
	{
	System.out.println("Current Speed is" +this.currentSpeed);
	 currentSpeed=speed;
		return currentSpeed;
	}

	public double setCurrentSpeed()
	{
	currentSpeed=0;
	return currentSpeed;
	}


	public double stopSpeed()
	{
	  return setCurrentSpeed();
	}

	/*public void turnDirection(double degree , String changeDirectionLeftRight)
	{
		if(changeDirectionLeftRight==TURN_LEFT)
			changeDirectionLeftRight=changeDirectionLeftRight+degree;
		else
			changeDirectionLeftRight=changeDirectionLeftRight+degree;
		
		return changeDirectionLeftRight;		

	}*/

	public static int highestIdentification()
	{
		return highestVehicleIdentificationNumber;
	}



	
	
}