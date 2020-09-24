package garage;

//Reference: https://github.com/JHarry444/Garage-CN/blob/master/src/com/qa/garage/Garage.java


import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> vehicles = new ArrayList<>();

	public Garage() {
		super();
	}

	public boolean addVehicle(Vehicle vehicle) {
		return this.vehicles.add(vehicle);
	}

	@Override
	public String toString() {
		return "Garage [vehicles=" + vehicles + "]";
	}

	public float calcBill() {
		float bill = 0;
		for (Vehicle vehicle : vehicles) {
			bill += vehicle.calcRepairCost();
		}
		return bill;
	}

	public boolean emptyGarage() {
		this.vehicles.clear();
		return this.vehicles.size() == 0;
	}

	public List<Vehicle> removeByType(String type) {
		List<Vehicle> toRemove = new ArrayList<>();

		for (Vehicle vehicle : this.vehicles) {
			if (vehicle.getClass().getSimpleName().equalsIgnoreCase(type)) {
				toRemove.add(vehicle);
			}
		}

		this.vehicles.removeAll(toRemove);

		return toRemove;
	}

}
