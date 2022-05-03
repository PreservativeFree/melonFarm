import java.util.ArrayList;

public class Main {

	public static void getSellabilityReport(ArrayList<Melon> melons) {
		for(Melon melon:melons) {
			System.out.print("Harvested by " + melon.harvester + " from field #" + melon.field);
			if(melon.isSellable()) {
				System.out.println(" (CAN BE SOLD)");
			} else {
				System.out.println(" (NOT SELLABLE)");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Instantiate objects here!");
		MelonType Musk = new MelonType("musk","Muskmelon", 1998, "green", true, true);
		MelonType Casaba = new MelonType("cas", "Casaba", 2003, "orange", false, false);
		MelonType Crenshaw = new MelonType("cren", "Crenshaw", 1996, "green", false, false);
		MelonType YellowWatermelon = new MelonType("yw", "Yellow Watermelon", 2013, "yellow", false, true);
		/*MelonType[] melonTypes = YOU_FILL_IN_THE_REST.*/
		ArrayList<MelonType> freshMelons = new ArrayList<>();
		freshMelons.add(Musk);
		freshMelons.add(Casaba);
		freshMelons.add(Crenshaw);
		freshMelons.add(YellowWatermelon);
		Melon melon1 = new Melon(YellowWatermelon, 8, 7, 2, "Sheila");
		Melon melon2 = new Melon(YellowWatermelon, 3, 4, 2, "Sheila");
		Melon melon3 = new Melon(Casaba, 10, 6, 35, "Sheila");
		Melon melon4 = new Melon(Crenshaw, 8, 9, 35, "Michael");
		Melon melon5 = new Melon(Crenshaw, 6, 7, 4, "Michael");
		Melon melon6 = new Melon(Musk, 6, 7, 4, "Michael");
		Melon melon7 = new Melon(YellowWatermelon, 7, 10, 3, "Sheila");
		/*MELON CLASS*/
		ArrayList<Melon> harvestedMelons = new ArrayList<>();
		harvestedMelons.add(melon1);
		harvestedMelons.add(melon2);
		harvestedMelons.add(melon3);
		harvestedMelons.add(melon4);
		harvestedMelons.add(melon5);
		harvestedMelons.add(melon6);
		harvestedMelons.add(melon7);
		System.out.println(freshMelons);
		getSellabilityReport(harvestedMelons);
	}

}
/*shape rating  > 5 and color rating > 5 and they didn't come from field 3*/