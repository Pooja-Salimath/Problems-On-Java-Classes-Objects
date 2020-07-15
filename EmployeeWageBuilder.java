class EmployeeWageBuilder
{
   public static final int IS_FULL_TIME = 1;
   public static final int IS_PART_TIME = 2;
   public static final int RATE_PER_HOUR = 20;

   public static void main(String[] args)
   {
	int empHrs = 0;
	int empWage = 0;

	System.out.println("----: Welcome to Employee Wage Builder :---");

	int empCheck = (int) Math.floor(Math.random() * 10 ) % 3;

	switch(empCheck)
	{
		case IS_FULL_TIME:
			empHrs = 8;
			break;
		case IS_PART_TIME:
			empHrs = 4;
			break;
		default :
			empHrs = 0;
	}
	empWage = empHrs * RATE_PER_HOUR;
        System.out.println("Employee Daily Wage: " +empWage);

   }
}
