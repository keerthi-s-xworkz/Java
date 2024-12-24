class Bannk{

static  String bankNames[]={null,null,null,null,null};
static int index;

    public static boolean addBankNames(String bankname){
     System.out.println("addBankNames started");
       boolean isBankNameAdded=false;
       if(bankname !=null){
        System.out.println("bankname contain value proceed");
        bankNames[index]=bankname;
            index++;
        isBankNameAdded=true;
    }else{
          System.out.println("add Bank Names is empty /null");
		  }
			 System.out.println("addBankNames ended");
			  return isBankNameAdded;

}
public static void getBankName(){
	System.out.println("getBankName started");
	System.out.println("list of banknames are");
	for(String bankname:bankNames)
		System.out.println( bankname);
	}
	public static boolean updateBankName(String newBankName,String oldBankName){
		boolean isBankNameUpdated=false;
		for(int start=0;start<bankNames.length;start++){
			if(bankNames[start]==oldBankName){
				
				bankNames[start]=newBankName;
				isBankNameUpdated=true;
				break;
			}
		}
		if(isBankNameUpdated==false)System.out.println(oldBankName+"not found");
		return isBankNameUpdated;
}
}




