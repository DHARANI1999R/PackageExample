package cargovehicles;

public class Truck 
{
	//instance or member variable
		int cargoCapacity;
		
		//no -arguement constructor
		public Truck()
		{
			
		}
		
		//parameterized constructor
		public Truck(int cargoCapacity)
		{
			this.cargoCapacity=cargoCapacity;
		}
		
		public int getCargoCapacity()
		{
			return cargoCapacity;
		}
		
		

	}
	
