package mainpackage;
import personalvehicles.*;
import cargovehicles.*;
import personalvehicles.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//className referencevariable =new constructorName();
		
		
		Bike bike=new Bike();
		System.out.println(bike);//toString() of an object class
		
		Bike bike1=new Bike("green",120,"activa",2022);
		System.out.println(bike1);
		
		bike.showDetails();
		
		Car car=new Car(6,120,"honda");
		System.out.println(car);
		
		System.out.println(car.getSeatCapacity()+" "+car.getModel()+" "+car.getSpeed());
	
		Ship ship=new Ship(100);
		System.out.println(ship.getWeight());
		
		Truck truck = new Truck(200);
		
		System.out.println(truck.getCargoCapacity());
	}

}