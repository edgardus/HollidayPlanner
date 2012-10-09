package za.cpt.activity.planner.to;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;



/**
 * @author Edgardus
 * @version 1.0
 * @created 09-oct-2012 18:06:38
 */
public class Itinerary {
	
	private User user;
	private ArrayList<ScheduledActivity> scheduledActivities;
	private Date versionDate;
	private BigDecimal totalCost;
	

	public Itinerary(){

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
	 * @return the scheduledActivities
	 */
	public ArrayList<ScheduledActivity> getScheduledActivities() {
		return scheduledActivities;
	}


	/**
	 * @param scheduledActivities the scheduledActivities to set
	 */
	public void setScheduledActivities(
			ArrayList<ScheduledActivity> scheduledActivities) {
		this.scheduledActivities = scheduledActivities;
	}


	/**
	 * @return the versionDate
	 */
	public Date getVersionDate() {
		return versionDate;
	}


	/**
	 * @param versionDate the versionDate to set
	 */
	public void setVersionDate(Date versionDate) {
		this.versionDate = versionDate;
	}


	/**
	 * @return the totalCost
	 */
	public BigDecimal getTotalCost() {
		return totalCost;
	}


	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(BigDecimal totalCost) {
		this.totalCost = totalCost;
	}

}