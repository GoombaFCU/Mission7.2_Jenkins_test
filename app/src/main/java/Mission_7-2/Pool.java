package Mission_7-2;

public class Pool {
	/*
	 * Made by D0611181
	 */
    public int Cash_check(String Qualifications, String Date, int Age, double Time) throws Exception	{
		int pay = 200;
		double save = 1.0;
		
		if(Time >= 5.0 && Time <= 22.0) {
			if(Age >= 3 && Age <= 75) {
				if(Date.equals("Sat") && Date.equals("Sun")) {
					pay = 250;
					if(Qualifications.equals("Member")) save = 0.5;
				}
				else {
					if(Qualifications.equals("Member")) save = 0.5;
					else if(Qualifications.equals("Group")) save = 0.7;
					else {
						if(Time <= 7.0) save = 0.8;
						else if(Age < 12 || Age >= 60) save = 0.8;
						else save = 1.0;
					}
				}
			}
			else {
				throw new Exception("This age is not alow to enter the swimming pool.");
			}
		}
		else {
			throw new Exception("The swimming pool is close now.");
		}
		
		pay = (int)(pay * save);
		
		return pay;
	}
}