public class FitnessTrackerHW17 {
    public static void main(String[] args) {
        User user1 = new User("Віталій", "Козачина", 17, "Жовтня", 1988,
                "my-Mail@gmail.com", 380671111111L, 95, new int[]{120, 80}, 7000);
        User user2 = new User("Андрій", "Білий", 21, "Січня", 1998,
                "his-Mail@gmail.com", 380672222222L, 85, new int[]{110, 70}, 6000);
        User user3 = new User("Ганна", "Іваненко", 3, "Червня", 1990,
                "her-Mail@gmail.com", 380673333333L, 55, new int[]{120, 85}, 11000);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();

        user1.setSteps(13000);
        user1.setWeight(94);
        user2.setSteps(5000);
        user2.setWeight(87);
        user2.setBloodPressure(new int[]{120, 85});

        user1.printAccountInfo();
        user2.printAccountInfo();
    }
}
