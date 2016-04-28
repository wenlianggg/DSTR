package wl.p04.q03;

import java.text.DecimalFormat;



public class StaffApp{

	public static void main (String[] args){
		StaffMember[] staffList = new StaffMember[6];
		double amount;
		double totalAmount=0;
		DecimalFormat fmt = new DecimalFormat("0.00");
		//------------------------------------------

		//  Sets up the list of staff members.

		//------------------------------------------

		staffList[0] = new Executive ("Sam", "123 Main Line", "555-0469", "123-45-6789", 1923.07);
		staffList[1] = new Employee ("Carla", "456 Off Line","555-0101", "987-65-4321", 846.15);
		staffList[2] = new Employee ("Woody", "789 Off Rocker","555-0000", "010-20-3040", 769.23);
		staffList[3] = new Hourly ("Diane", "678 Fifth Ave.","555-0690", "958-47-3625", 8.55);
		staffList[4] = new Volunteer ("Norm", "987 Suds Blvd.", "555-8374");
		staffList[5] = new Volunteer ("Cliff", "321 Duds Lane","555-7282");

		if(staffList[0] instanceof Executive)
			((Executive)staffList[0]).awardBonus(5000);

		for(StaffMember staff : staffList) {
			if (staff instanceof Hourly) {
				((Hourly)staff).addHours(40);
			}
		}

		//------------------------------------------------------

		//  write the for loop to display output from the array.

		//------------------------------------------------------

		for (StaffMember stf : staffList){
			System.out.println (stf);
			amount = stf.pay();  // polymorphic
			totalAmount += amount;

			if (amount == 0.0)
				System.out.println("Nothing paid");
			else
				System.out.println ("Paid: " + amount);

			if(stf instanceof Executive)
				System.out.println("Bonus: " + ((Executive)stf).getBonus());
			else if( stf instanceof Hourly)
				System.out.println("Pay rate: " +((Hourly)stf).getPayRate());

			System.out.println ("---------------------------------");
		}
		System.out.println("Total pay for all staff: " + fmt.format(totalAmount));
		System.out.println ("-----------------------------------");

	}

}