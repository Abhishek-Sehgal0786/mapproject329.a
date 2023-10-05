package mapproject329;

public class computer {
	private String brand;

	private String model;

	private double price;

	private long serialNumber;

	private static int serialNumberCounter = 100000;

	private static int computercounter = 0;

	 

	public computer(String br,String m,double pr)

	{

	brand=br;

	model = m;

	price = pr;

	serialNumber = serialNumberCounter;

	serialNumberCounter++;

	}

	public void setbrand(String br)

	{

	brand = br;

	}

	public String getbrand()

	{

	return brand;

	}

	public void setmodel(String m)

	{

	model = m;

	}

	public String getmodel()

	{

	return model;

	}

	public void setprice(double pr)

	{

	price = pr;

	}

	public double getprice()

	{

	return price;

	}

	public void setserialNumber(long sr)

	{

	serialNumber = sr;

	}

	public long getserialNumber()

	{

	return serialNumber;

	}

	public static void displayComputer(computer c )

	{

	System.out.println("the info is :"+ c.getserialNumber());

	System.out.println("the computer brand is :"+ c.getbrand());

	System.out.println("The computer price is $ :"+ c.getprice());

	System.out.println("The computer model is :"+ c.getmodel());

	// System.out.println("the info is: "+ c.getserialNumber());

	}

	@Override

	public String toString()

	{

	return "Computer [brand=" +brand +",model=" + model +",price=" +price+",serialNumber="+serialNumber+"]";

	}

	 

	public static int findNumberofCreatedcoumputer()

	{

	return computercounter;

	}

	 

	public static void findcheaperBy(computer[] computers, double maxprice)

	{

	System.out.println("Computers with a price less than $" + maxprice + ":");

	for (computer computer : computers) {

	if (computer != null && computer.getprice() < maxprice) {

	System.out.println(computer);

	}

	}

	}

	public static void findComputersByBrand(computer[] computers, String brandName) {

	System.out.println("Computers with the brand name: " + brandName);

	boolean found = false;

	 

	for ( computer computer : computers) {

	if (computer != null && computer.getbrand().equals(brandName)) {

	System.out.println(computer);

	found = true;

	}

	}

	 

	if (!found) {

	System.out.println("No computers found with the specified brand name.");

	}

	}

	 

}
