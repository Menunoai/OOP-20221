public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	int qtyOrdered = 0;

//	in thông tin từng DVD
	public void print(DigitalVideoDisc disc) {
		System.out.println(disc.getTitle() + " - " + disc.getCategory() + " - " + disc.getDirector() + " - "
				+ disc.getLength() + " - " + disc.getCost());
	}

//	add DVD
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered <= MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.println("Đã thêm " + qtyOrdered + " DVD!");
		} else {
			System.out.println("Đã đầy 20 DVD!");
		}
	}
	
// Nạp chồng phương thức 1
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		
	}

// Nạp chồng phương thức 2
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
			
	}

//  in thông tin giỏ hàng
	public void printCart() {
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - "
					+ itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + " - "
					+ itemsOrdered[i].getCost());
		}
	}

//  Tính tiền
	public float totalCost() {
		float sum = 0.0f;
		for (int i = 0; i < qtyOrdered; i++) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}

//  xóa DVD
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int i, c;
		for (c = i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i].getTitle() != disc.getTitle()) {
				itemsOrdered[c] = itemsOrdered[i];
				c++;
			}
		}
		qtyOrdered = c;
	}	
}
