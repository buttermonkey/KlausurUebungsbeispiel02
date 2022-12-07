package org.campus02.social;

public class DemoSN {

	public static void main(String[] args) {
		
		SocialNetwork sn = SocialNetwork.generateDemoNetwork();
		
		for (User user : sn.getUsers()) {
			System.out.println(user);
		}

		System.out.println();

		for (User user : sn.findAllFriends(sn.getUsers().get(1), 1, 1)) {
			System.out.println(user);
		}
	}
	
}
