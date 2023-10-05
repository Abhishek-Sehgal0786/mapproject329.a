package mapproject329;


	import java.util.Scanner;

	public class store_project {

	 

	public static void main(String[] args) {

	// TODO Auto-generated method stub

	 

	 

	Scanner kb = new Scanner(System.in);

	System.out.println("Welcome to computer store");

	int maxcomputer = 0;

	while(maxcomputer<1)

	{

	System.out.println("Please give me size of invetory?");

	maxcomputer = kb.nextInt();

	if(maxcomputer<1)

	{

	System.out.println("Invalid the inventory should be positive");

	}

	}

	computer[] inventory = new computer[maxcomputer];

	do

	{

	System.out.println("\nwhat do you want to do?");

	System.out.println("press 1. Enter new computers");

	System.out.println("press 2. Change information of a computer");

	System.out.println("press 3. Display all computers by a specific brand");

	System.out.println("press 4. Display all computers under a certain a price.");

	System.out.println("press 5. Quit");

	System.out.println("Please enter your choice >");

	int choicemenu = kb.nextInt();

	String password = "password";

	switch(choicemenu)

	{

	case 1:

	if(choicemenu==1)

	{

	System.out.println("Enter the password");

	String lock=kb.next();

	int max_attempt=3;

	int count=0;

	int attempts = 1;

	if(!lock.equals(password))

	{

	do

	{

	count++;

	attempts= max_attempt-count;

	System.out.println("incorrect password " +attempts+" tries are left");

	System.out.println("Enter the password");

	lock=kb.next();

	if(lock.equals(password)) {

	break;

	}

	if(attempts==1)

	{

	System.out.println("access denied No more tries");

	System.exit(0);

	}

	}while( count<=max_attempt);

	}

	if(lock.equals(password))

	{

	System.out.println("Valid password");

	System.out.println("How many computers you want to enter:");

	int comp=kb.nextInt();

	if(comp<=0)

	{

	System.out.println("please Enter the valid number");

	break;

	}

	 

	if (comp > maxcomputer - getNumComputers(inventory))

	{

	int remainingPlaces = maxcomputer - getNumComputers(inventory);

	System.out.println("You can only add " + remainingPlaces + " computers. Space is limited.");

	comp = remainingPlaces;

	break;

	}

	for(int i=0;i<comp;i++)

	{

	System.out.println("Enter the " + (i+1) +" brand name");

	String brand = kb.next();

	System.out.println("Enter the price");

	double price = kb.nextDouble();

	System.out.println("Enter the model");

	String model = kb.next();

	computer Computer = new computer( brand, model,price);

	inventory[i+1] = Computer;

	System.out.println("Computer " + brand + " " + model + " has been added to the store.");

	}

	 

	 

	}

	}

	 

	case 2:

	if(choicemenu==2)

	{

	System.out.println("Enter the password");

	String lock=kb.next();

	int max_attempt=3;

	int count=0;

	if(!lock.equals(password))

	{

	do

	{

	count++;

	int attempts= max_attempt-count;

	System.out.println("incorrect password " +attempts+" tries are left");

	System.out.println("Enter the password");

	lock=kb.next();

	if(lock.equals(password)) {

	break;

	}

	if(attempts==1)

	{

	System.out.println("access denied No more tries");

	System.exit(0);

	}

	}while( count<=max_attempt);

	}

	if(lock.equals(password))

	{

	System.out.println("Valid password");

	System.out.println("Enter index of computer that u want to change information:");

	int compu=kb.nextInt();

	int comput=0;

	if(compu>=1 && compu<inventory.length && inventory[compu]!=null)

	{

	computer computerToUpdate = inventory[compu];

	System.out.println("Current information of Computer " + compu);

	System.out.println("Brand: " + computerToUpdate.getbrand());

	System.out.println("Model: " + computerToUpdate.getmodel());

	System.out.println("SN: " + computerToUpdate.getserialNumber());

	System.out.println("Price: $" + computerToUpdate.getprice());

	 

	System.out.println("What information would you like to change:");

	System.out.println("Press 1 To change the brand name");

	System.out.println("Press 2 To change the model");

	System.out.println("Press 3 To change the SN");

	System.out.println("Press 4 To change the price");

	System.out.println("Press 5 To Quit");

	System.out.println("Enter the attribute you want to change");

	comput=kb.nextInt();

	switch(comput)

	{

	case 1:

	if(comput==1)

	{

	System.out.println("Enter the new brand");

	String newbrand = kb.next();

	inventory[compu].setbrand(newbrand);

	computer.displayComputer(inventory[compu]);

	break;

	}

	case 2:

	if(comput==2)

	{

	System.out.println("Enter the model name");

	String newmodel = kb.next();

	inventory[compu].setmodel(newmodel);

	computer.displayComputer(inventory[compu]);

	break;

	}

	case 3:

	if(comput==3)

	{

	System.out.println("Enter the serial number");

	int serialnum = kb.nextInt();

	inventory[compu].setserialNumber(serialnum);

	computer.displayComputer(inventory[compu]);

	break;

	}

	case 4:

	if(comput==4)

	{

	System.out.println("Enter the price");

	double price = kb.nextDouble();

	inventory[compu].setprice(price);

	computer.displayComputer(inventory[compu]);

	break;

	}

	case 5:

	if(comput==5)

	{

	System.exit(0);

	}

	default:

	{

	System.out.println("Invalid choice. Please enter a valid option (1-5).");

	}

	//}

	System.out.println("Updated information of Computer #" + compu);

	System.out.println("Brand: " + computerToUpdate.getbrand());

	System.out.println("Model: " + computerToUpdate.getmodel());

	System.out.println("SN: " + computerToUpdate.getserialNumber());

	System.out.println("Price: $" + computerToUpdate.getprice());

	}

	}

	else if(compu>=maxcomputer)

	{

	System.out.println("Your index is out of the inventory");

	break;

	}

	}

	 

	}

	case 3:

	if(choicemenu==3)

	{

	System.out.println("Enter the brand name");

	String name = kb.next();

	computer.findComputersByBrand(inventory,name);

	break;

	}

	case 4:

	if(choicemenu==4)

	{

	System.out.println("Enter the maximum price");

	double maxprice=kb.nextDouble();

	computer.findcheaperBy(inventory, maxprice);

	}

	case 5:

	if(choicemenu==5)

	{

	System.out.println("Thanku for visiting");

	System.exit(0);

	}

	}

	}while(true);

	}

	private static int getNumComputers(computer[] computerStore) {

	int count = 0;

	for (computer computer : computerStore) {

	if (computer != null) {

	count++;

	}

	}

	return count;

	}

	 

	}

	 

}
