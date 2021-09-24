import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies = new ArrayList<>();

    public void addBuddy(BuddyInfo buddyInfo){
        buddies.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo){
        buddies.remove(buddyInfo);
    }

    public static void main(String[] args) {
        System.out.println("Address book");
        BuddyInfo buddy1 = new BuddyInfo();
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy1);
        addressBook.removeBuddy(buddy1); //extra useless change
    }
}
