public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();

		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.print(dvd1);

		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.print(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.print(dvd3);

		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);
		
		anOrder.printCart();
		System.out.println("Tổng tiền: " + anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd2);

		anOrder.printCart();
		System.out.println("Tổng tiền: " + anOrder.totalCost());
	}
}
