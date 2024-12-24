class ShoppingMallRunner{
	
	public static void main(String args[]){
		
		System.out.println("main started");
		boolean isShopNameAdded =ShoppingMall.addShopName("gt mall");
		System.out.println("is shop name added "+isShopNameAdded);
		
		isShopNameAdded =ShoppingMall.addShopName("mantri square");
		System.out.println("is shop name added "+isShopNameAdded);
		
		isShopNameAdded =ShoppingMall.addShopName("orion");
		System.out.println("is shop name added "+isShopNameAdded);
		
		isShopNameAdded =ShoppingMall.addShopName("phoenix");
		System.out.println("is shop name added "+isShopNameAdded);
		
		isShopNameAdded =ShoppingMall.addShopName("lulu");
		System.out.println("is shop name added "+isShopNameAdded);
		
		isShopNameAdded =ShoppingMall.addShopName("ub city");
		System.out.println("is shop name added "+isShopNameAdded);
		
		isShopNameAdded =ShoppingMall.addShopName("VR mall");
		System.out.println("is shop name added "+isShopNameAdded);
		
		isShopNameAdded =ShoppingMall.addShopName(" forummall");
		System.out.println("is shop name added "+isShopNameAdded);
		
		isShopNameAdded =ShoppingMall.addShopName("gopalan");
		System.out.println("is shop name added "+isShopNameAdded);
		
		isShopNameAdded =ShoppingMall.addShopName("elements mall");
		System.out.println("is shop name added "+isShopNameAdded);
		
				ShoppingMall.getShopName();
				
				boolean shoppingmallNameUpdate =ShoppingMall.updateShopName("SLV","VR mall");
		System.out.println("is shopping mall name is undated "+shoppingmallNameUpdate);
		
        ShoppingMall.getShopName();
		
		System.out.println("main ended");
	}
}