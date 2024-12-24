class BlinKitt{
static  String productNames[]={null,null,null,null,null,null,null,null};
static int index;
    public static boolean addProductName(String productname){
     System.out.println("addProductName started");
       boolean isProductNameAdded=false;
       if(productname !=null){
        System.out.println("product name contain value proceed");
        productNames[index]=productname;
            index++;
        isProductNameAdded=true;
    }else{
          System.out.println("product name is empty /null");
		  }
			 System.out.println("addProductName ended");
			  return isProductNameAdded;
}
public static void getProductName(){
	System.out.println("getProductName started");
	System.out.println("list of productNames are");
	for(String productname:productNames)
		System.out.println( productname);
	}
	public static boolean updateProductName(String newProductName,String oldProductName){
		boolean isProductNameUpdated=false;
		for(int start=0;start<productNames.length;start++){
			if(productNames[start]==oldProductName){
				
				productNames[start]=newProductName;
				isProductNameUpdated=true;
				break;
			}
		}
		if(isProductNameUpdated==false)System.out.println(oldProductName+"not found");
		return isProductNameUpdated;
}
}



