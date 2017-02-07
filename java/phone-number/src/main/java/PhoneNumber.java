public class PhoneNumber {
	private String phoneNumber;
	public PhoneNumber(String number) {
		phoneNumber = number.replaceAll("[^0-9]", "");
	}
	public String getNumber() {
		if(phoneNumber.length()>9 && phoneNumber.length()<12){
			if(phoneNumber.length()==11)
				if(phoneNumber.startsWith("1"))
					return phoneNumber.substring(1, phoneNumber.length());
				else
					throw new IllegalArgumentException("Can only have 11 digits if number starts with '1'");
			return phoneNumber;
		}
		throw new IllegalArgumentException("Number must be 10 or 11 digits");
	}
	public String getAreaCode(){
		return this.getNumber().substring(0,3);
	}
	public String pretty(){		
		return "("+this.getAreaCode()+") "+this.getNumber().substring(3,6)+"-"+this.getNumber().substring(6,10);
	}
}