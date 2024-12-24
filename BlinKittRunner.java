class BlinKittRunner{
	
	public static void main(String cell[]){
		
		System.out.println("main started");
		boolean isProductNameAdded =BlinKitt.addProductName("dall");
		System.out.println("is product added "+isProductNameAdded);
		
		isProductNameAdded =BlinKitt.addProductName("aashirvaad");
		System.out.println("is product added "+isProductNameAdded);
		
		isProductNameAdded =BlinKitt.addProductName("pearspure ");
		System.out.println("is product added "+isProductNameAdded);
		
		isProductNameAdded =BlinKitt.addProductName("amulpure milk");
		System.out.println("is product added "+isProductNameAdded);
		
		isProductNameAdded =BlinKitt.addProductName("mustard oil");
		System.out.println("is product added "+isProductNameAdded);
		
	    isProductNameAdded =BlinKitt.addProductName("honey");
		System.out.println("is product added "+isProductNameAdded);
		
		isProductNameAdded =BlinKitt.addProductName("biscuits ");
		System.out.println("is product added "+isProductNameAdded);
		
		isProductNameAdded =BlinKitt.addProductName("colddrinks");
		System.out.println("is product added "+isProductNameAdded);
	
		BlinKitt.getProductName();
		
		boolean productNameUpdate =BlinKitt.updateProductName("cakes","biscuits");
		System.out.println("is product  name update "+productNameUpdate);
		
        BlinKitt.getProductName();
		
		System.out.println("main ended");
	}
}