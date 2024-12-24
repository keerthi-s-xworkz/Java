//java is call by value always
 enum variable is called as static variable
 lombok is liberary



class Operation{  
 int data=10;  
  
 void change(int data){  
 data=data+200;
 }  
     
 public static void main(String args[]){  
   Operation op=new Operation();  
  
   System.out.println("before change "+op.data);  
   op.change(100);  
   System.out.println("after change "+op.data);  
  
 }  
}  
