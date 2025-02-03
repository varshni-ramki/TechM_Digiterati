package week_1_task;

public class UserMAin {
	  public static void main(String[] args) {
	        // Creating objects of User and SecondUser
	        User user1 = new User("Alice", 25);
	        User user2 = new User("Alice", 25);
	        SecondUser secondUser1 = new SecondUser("Alice", 25);
	        SecondUser secondUser2 = new SecondUser("Alice", 25);

	        // Printing objects using toString()
	        System.out.println("User 1: " + user1);
	        System.out.println("User 2: " + user2);
	        System.out.println("SecondUser 1: " + secondUser1);
	        System.out.println("SecondUser 2: " + secondUser2);

	        // Comparing objects using equals()
	        System.out.println("\nComparing User objects using equals():");
	        System.out.println("user1.equals(user2): " + user1.equals(user2)); // true, because both have the same data

	        System.out.println("\nComparing SecondUser objects using equals():");
	        System.out.println("secondUser1.equals(secondUser2): " + secondUser1.equals(secondUser2)); // false, because equals() is not overridden

	        // Comparing hashCode values
	        System.out.println("\nComparing hashCode of User objects:");
	        System.out.println("user1.hashCode(): " + user1.hashCode());
	        System.out.println("user2.hashCode(): " + user2.hashCode());

	        System.out.println("\nComparing hashCode of SecondUser objects:");
	        System.out.println("secondUser1.hashCode(): " + secondUser1.hashCode());
	        System.out.println("secondUser2.hashCode(): " + secondUser2.hashCode());
	    }

}
