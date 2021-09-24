public class BuddyInfo {
    public String getName() {
        return name;
    }

    private String name;

    public String getAddress() {
        return address;
    }

    private String address;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private String phoneNumber;

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo();
        System.out.println(String.format("Hello %s", buddy.getName()));
    }

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this("Tom", "404 road does not exist", "*random combination of numbers*");
    }
}
