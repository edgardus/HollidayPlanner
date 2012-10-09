package za.cpt.activity.planner.to;

import java.util.ArrayList;



/**
 * @author Edgardus
 * @version 1.0
 * @created 09-oct-2012 18:06:38
 */
public class Basket {
	
	/**
	 * Activities added to the basket
	 */
	private ArrayList<Activity> activities;
	
	private User user; 
	public Basket(){
	
		
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	

	

	
	/**
	 * @return the activities
	 */
	public ArrayList<Activity> getActivities() {
		return activities;
	}

	/**
	 * @param activities determinate the list of activities.
	 */
	public void setActivities(ArrayList<Activity> activities) {
		this.activities = activities;
	}

}