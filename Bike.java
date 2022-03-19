package personalvehicles;

public class Bike 
{
	public String color;
	private int speed;
	protected String model;
	int year;
	
	public Bike() 
	{
		color="red";
		speed=80;
		model="zen";
		year=1990;
	}
	
	public Bike(String color, int speed, String model, int year)
	{
		this.color=color;//green
		this.speed=speed;//120
		this.model=model;//activa
		this.year=year;//2022
		
	}
	
	public void showDetails()
	{
		System.out.println(color+" "+speed+" "+model+" "+year);
	}
	
	public String toString()
	{
		return color+" "+speed+" "+model+" "+year;
	}

}
