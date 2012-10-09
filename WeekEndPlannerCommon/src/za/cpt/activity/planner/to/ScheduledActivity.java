package za.cpt.activity.planner.to;

import java.math.BigDecimal;
import java.util.Date;



/**
 * @author Edgardus
 * @version 1.0
 * @created 09-oct-2012 18:06:39
 */
public class ScheduledActivity {
	
	private Activity activity;
	private Date date;
	private Date duration;
	private Transport transport;
	private BigDecimal cost;
	

	public ScheduledActivity(){

	}


	/**
	 * @return the activity
	 */
	public Activity getActivity() {
		return activity;
	}


	/**
	 * @param activity the activity to set
	 */
	public void setActivity(Activity activity) {
		this.activity = activity;
	}


	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}


	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	/**
	 * @return the duration
	 */
	public Date getDuration() {
		return duration;
	}


	/**
	 * @param duration the duration to set
	 */
	public void setDuration(Date duration) {
		this.duration = duration;
	}


	/**
	 * @return the transport
	 */
	public Transport getTransport() {
		return transport;
	}


	/**
	 * @param transport the transport to set
	 */
	public void setTransport(Transport transport) {
		this.transport = transport;
	}


	/**
	 * @return the cost
	 */
	public BigDecimal getCost() {
		return cost;
	}


	/**
	 * @param cost the cost to set
	 */
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

}