package multiThreading;

/**
 * If we need to execute some lines of code within a method, then we should
 * synchronize only block of the code within which required instructions are
 * exists. This is more efficient than method synchronization
 */
public class SynchronizedBlock {

	public static void main(String[] args) {

		Price price = new Price();

		Product product = new Product(price);
		Product product2 = new Product(price);

		product.start();
		product2.start();

	}

}

class Price {

	// We can remove the below synchronized keyword to see the chance of
	// collision
	synchronized public void getPrice() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Product extends Thread {
	Price productPrice;

	Product(Price currentPrice) {
		this.productPrice = currentPrice;
	}

	@Override
	public void run() {
		productPrice.getPrice();
	}
}

/*

*Out put -

0
1
2
3
4
0
1
2
3
4

*/
