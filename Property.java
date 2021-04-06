//Property.java
public class Property {
	private String name;
	private String cityName;
	private double rent;
	private String propOwner;

//plot is just a variable, we must create its object before its use inside constructor.
	private Plot plot;

	public Property() {
		name = "";
		cityName = "";
		propOwner = "";
		rent = 0.0;

		/* Create a default constructor object,plot */
		plot = new Plot();
	}

	public Property(String propertyName, String city, double rentAmount, String owner) {
		name = propertyName;
		cityName = city;
		rent = rentAmount;
		propOwner = owner;
		/* Create a default constructor object,plot */
		plot = new Plot();

	}

	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width,
			int depth) {
		name = propertyName;
		cityName = city;
		rent = rentAmount;
		propOwner = owner;

		/*
		 * Error correction : An object of Plot must be created before calling the
		 * methods of plot class in this constructor. otherwise it throws an error
		 */
		plot = new Plot();

		plot.setX(x);
		plot.setY(y);
		plot.setWidth(width);
		plot.setDepth(depth);
	}

	public Property(Property p) {
		/*
		 * Call getter methods of Property object,p to set the values to the instance
		 * variables of this class
		 */
		name = p.getPropertyName();
		cityName = p.getCity();
		rent = p.getRentAmount();
		propOwner = p.getOwner();
	}

	public void setPropertyName(String propertyName) {
		name = propertyName;
	}

	public void setCity(String city) {
		cityName = city;
	}

	public void setRentAmount(double rentAmount) {
		rent = rentAmount;
	}

	public void setOwner(String owner) {
		propOwner = owner;
	}

	public Plot getPlot() {
		return plot;
	}

	public String getPropertyName() {
		return name;
	}

	public String getCity() {
		return cityName;
	}

	public double getRentAmount() {
		return rent;
	}

	public String getOwner() {
		return propOwner;
	}

	public String toString() {
		return "Property name: " + getPropertyName() + "\nLocated in " + getCity() + "\n Belonging to: " + getOwner()
				+ "\n Rent Amount: " + getRentAmount() + "\n ";
	}
}