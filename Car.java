package personalvehicles;

public class Car
{
	int seatCapacity;
	private int speed;
	protected String model;
	
	public Car() 
	{
		
	}

	public Car(int seatCapacity, int speed, String model) 
	{
		super();
		this.seatCapacity = seatCapacity;
		this.speed = speed;
		this.model = model;
	}
	public int getSpeed()
	{
		return speed;
	}
	public String getModel()
	{
		return model;
	}
	//getter method
	public int getSeatCapacity()
	{
		return seatCapacity;
	}
	
	
}