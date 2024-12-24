package stationaryitems;

import satitems.Item;

public class StationaryItemsRunner {

        public static void main(String[] args) {
            StationaryItems stationaryItems =new StationaryItems();
            Item item = new Item();
            System.out.println(item);
            item.setItemId(3);
            item.setName("orea");
            item.setType("britina");
            item.setPrice(99.99);

            StationaryItems stationaryItems1 =new StationaryItems();
            Item item1 = new Item();
            System.out.println(item);
            item1.setItemId(3);
            item1.setName("orea");
            item1.setType("britina");
            item1.setPrice(99.99);


//            stationaryItems.addItem(item);
//            //stationaryItems.updateName("parl");
//            System.out.println("stationary item id is " + item.getItemId());
//            System.out.println("stationary item shop name is "+item.getName());
//            System.out.println("stationary item type is "+item.getType());
//            System.out.println("statioary item price is "+item.getPrice());
            //System.out.println(item);

            boolean same=item1.equals(item);
            System.out.println(same);


            System.out.println(item.hashCode());
            System.out.println(item1.hashCode());
        }
    }


