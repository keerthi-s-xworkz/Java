package stationaryitems;

import satitems.Item;

import javax.lang.model.element.Name;

public class StationaryItems {
        Item item;
        public boolean addItem(Item item) {
            boolean isAdded = false;
            if (item != null) {
                if (item.getItemId() > 0 && item.getName() != null) {
                    this.item = item;
                    isAdded = true;
                }
            }
            return isAdded;
        }
//        public boolean updateName(String updateName){
//            boolean isNameUpdated = false;
//            if(updateName > 0 && updateName != name.getName){
//                name.setName(updateName);
//                    isUpdated = true;
//                }
//            }
//            return isNameUpdated;
//
//        }

    }


