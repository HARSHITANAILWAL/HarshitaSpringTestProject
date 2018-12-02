package loanProject;

public class HousingLoan {

	private int customerId;
	private int duration;
	private float interestRate;
	private double loanAmount;
	private char typeOfInterest;
	protected PropertyDetails propertyDetails;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public float getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public char getTypeOfInterest() {
		return typeOfInterest;
	}
	public void setTypeOfInterest(char typeOfInterest) {
		this.typeOfInterest = typeOfInterest;
	}
	public PropertyDetails getPropertyDetails() {
		return propertyDetails;
	}
	public void setPropertyDetails(PropertyDetails propertyDetails) {
		this.propertyDetails = propertyDetails;
	}
	
}
