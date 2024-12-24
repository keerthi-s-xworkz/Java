class ShoppingMall{

static  String shopNames[]={null,null,null,null,null,null,null,null,null,null};
static int index;

    public static boolean addShopName(String shopName ){
     System.out.println("shopName started");
       boolean isShopNameAdded=false;
       if(shopName !=null){
        System.out.println("shop name contains the value ");
        shopNames[index]=shopName ;
            index++;
       isShopNameAdded =true;
    }else{
          System.out.println("shopName is empty /null");
		  }
			 System.out.println("shopName ended");
			  return isShopNameAdded;

}
public static void getShopName(){
	System.out.println("get shop name started");
	System.out.println("list of shop names are");
	for(String shopName:shopNames)
		System.out.println(shopName );
	}
	public static boolean updateShopName(String newShopName,String oldShopName){
		boolean isShopNameUpdated=false;
		for(int start=0;start<shopNames.length;start++){
			if(shopNames[start]==oldShopName){
				
				shopNames[start]=newShopName;
				isShopNameUpdated=true;
				break;
			}
		}
		if(isShopNameUpdated==false)System.out.println(oldShopName+"not found");
		return isShopNameUpdated;
}
}

