package smart_kitchen;

public class Main {

    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();
        /**
         * Accessing each appliance by using a getter and setter methods:
         * smartKitchen.getDishWasher().setHasWorkToDo(true);
         * smartKitchen.getIceBox().setHasWorkToDo(true)
         * smartKitchen.getBrewMaster().setHasWorkToDo(true);
         * smartKitchen.getDishWasher().doDishes();
         * smartKitchen.getIceBox().orderFood();
         * smartKitchen.getBrewMaster().brewCoffee(); */

        /**
         * Not accessing each appliance directly, but using SmartKitchen methods to set the work state and perform tasks:
         * */
        smartKitchen.setKitchenState(true, true, false);
        smartKitchen.doKitchenWork();

    }
}
