package satitems;

public class Item {
        private String Name ;
        private double price;
        private int itemId;
        private String type;

        public Item(){

        }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
//    @Override
//    public String toString(){
//            return "item -(itemId ="+this.itemId+","+
//                    "type="+this.type+")";
//    }

    @Override
    public int hashCode(){
        return this.itemId;
    }


    @Override
    public  boolean equals (Object obj){
        Item item=(Item) obj;     //explicit type casting
        //if(this.bookId==book.bookId && bookName ==book.bookName && author ==book.author && price==book.price)
        if (this.hashCode()==item.hashCode())
            return true;

        return false;
    }

}
