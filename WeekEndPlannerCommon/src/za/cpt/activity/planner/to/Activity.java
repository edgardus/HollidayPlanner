package za.cpt.activity.planner.to;



/**
 * @author Edgardus
 * @version 1.0
 * @created 09-oct-2012 18:06:38
 */
public class Activity {

	/**
	 * User of the activity
	 */
	private User provider;
	

	public Activity(){

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