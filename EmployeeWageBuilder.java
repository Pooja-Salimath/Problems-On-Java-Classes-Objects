class EmployeeWageBuilder
{
  public static void main(String[] args)
  {
	int IS_FULL_TIME = 1;
	int RATE_PER_HOUR = 20;
	int empHrs = 0,empWage = 0;

	System.out.println("----: Welcome to Employee Wage Builder :---");

	double empCheck = Math.floor(Math.random() * 10 ) % 2;

	if(empCheck == IS_FULL_TIME)
	{
		empHrs = 8;
		System.out.println("Employee is Present");
		empWage = empHrs * RATE_PER_HOUR;
		System.out.println("Employee Daily Wage: " +empWage);
	}
	else
	{
		System.out.println("Employee is Absent");
	}
   }
}
