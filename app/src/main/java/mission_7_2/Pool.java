package mission_7_2;

public class Pool {
	/*
	 * Made by D0611181
	 */
    public int cashCheck(String qualifications, String date, int age, double time) throws Exception	{
		int pay = 200;
		double save = 1.0;
		
		if(time >= 5.0 && time <= 22.0) {
			if(age >= 3 && age <= 75) {
				if(date.equals("Sat") || date.equals("Sun")) {
					pay = 250;
					if(qualifications.equals("Member")) save = 0.5;
				}
				else {
					if(qualifications.equals("Member")) save = 0.5;
					else if(qualifications.equals("Group")) save = 0.7;
					else {
						if(time <= 7.0) save = 0.8;
						else if(age < 12 || age >= 60) save = 0.8;
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