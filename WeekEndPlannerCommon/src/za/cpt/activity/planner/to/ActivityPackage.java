package za.cpt.activity.planner.to;

import java.util.ArrayList;



/**
 * @author Edgardus
 * @version 1.0
 * @created 09-oct-2012 18:06:38
 */
public class ActivityPackage {
	
	/**
	 * List of activities of that package.
	 */
	private ArrayList<Activity> activities;
	
	/**
	 * User or provider 
	 */
	private User provider;

	public ActivityPackage(){

	}

	/**
	 * @return the activities
	 */
	public ArrayList<Activity> getActivities() {
		return activities;
	}

	/**
	 * @param activities the activities to set
	 */
	public void setActivities(ArrayList<Activity> activities) {
		this.activities = activities;
	}

	/**
	 * @return the provider
	 */
	public User getProvider() {
		return provider;
	}

	/**
	 * @param provider the provider to set
	 */
	public void setProvider(User provider) {
		this.provider = provider;
	}

}