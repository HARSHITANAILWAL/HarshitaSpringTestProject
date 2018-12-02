package loanProject;

public class LoanTest  {

	public static void main(String[] args) {
		Address add=new Address();
		add.setAddressLine1("Electronic City");
		add.setAddressLine2("Phase-2");
		add.setCity("Bangalore");
		add.setState("Karnataka");
		add.setZip("560100");
		
		PropertyDetails prop=new PropertyDetails();
		prop.setAddress(add);
		prop.setDocumentNo(1111);
		prop.setPropertyHolderName("Harshita Nailwal");
		
		HousingLoan hou=new HousingLoan();
		hou.setCustomerId(10001);
		hou.setDuration(3);
		hou.setInterestRate(12.0f);
		hou.setLoanAmount(1000000.0);
		hou.setPropertyDetails(prop);
		hou.setTypeOfInterest('F');
		
		
		System.out.println("CustomerId: "+hou.getCustomerId());
		System.out.println("Duration: "+hou.getDuration());
		System.out.println("Interest Rate: "+hou.getInterestRate());
		System.out.println("Loan Amaount: "+hou.getLoanAmount());
		System.out.println("Type Of Interest: "+hou.getTypeOfInterest());
		System.out.println("Property Holder Name: "+hou.propertyDetails.getPropertyHolderName());
		System.out.println("Document Number: "+hou.propertyDetails.getDocumentNo());
		System.out.println("Address Line 1 : "+hou.propertyDetails.address.getAddressLine1());
	    System.out.println("Address Line 2: "+hou.propertyDetails.address.getAddressLine2());
	    System.out.println("City: "+hou.propertyDetails.address.getCity());
	    System.out.println("State: "+hou.propertyDetails.address.getState());
	    System.out.println("ZipCode: "+hou.propertyDetails.address.getZip());
	}
}
