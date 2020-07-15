class EmployeeWageBuilder
{
  public static void main(String[] args)
  {
	int IS_FULL_TIME = 1;
	int IS_PART_TIME = 2;
	int RATE_PER_HOUR = 20;
	int empHrs = 0;
	int empWage = 0;

	System.out.println("----: Welcome to Employee Wage Builder :---");

	double empCheck = Math.floor(Math.random() * 10 ) % 3;

	if (empCheck == IS_FULL_TIME)
			empHrs = 8;
	else if (empCheck == IS_PART_TIME)
			empHrs = 4;
	else
			empHrs = 0;
	empWage = empHrs * RATE_PER_HOUR;
        System.out.println("Employee Daily Wage: " +empWage);

   }
}
