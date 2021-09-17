import java.util.ArrayList;

public class AddressBook {
    private ArrayList<BuddyInfo> buddies = new ArrayList<BuddyInfo>();

    public void addBuddy(BuddyInfo buddyInfo){
        buddies.add(buddyInfo);
    }

    public void removeBuddy(BuddyInfo buddyInfo){
        buddies.remove(buddyInfo);
    }

    public static void main(String[] args) {
        System.out.println("Address book");
    }
}
