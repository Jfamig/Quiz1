package quiz1;
import java.util.Scanner;
public class QB {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the number of complete passes.");
		double completions = input.nextDouble();
		
		System.out.println("Please input the number of touchdowns.");
		double touchdowns = input.nextDouble();
		
		System.out.println("Please input the number of interceptions.");
		double interceptions = input.nextDouble();
		
		System.out.println("Please input the number of atempted passes.");
		double passes = input.nextDouble();
		
		System.out.println("Please input the number of yards.");
		double yards = input.nextDouble();
		
		double f1 = ((completions/passes) - .3)*5;
		double f2 = ((yards/passes)-3)*.25;
		double f3 = (touchdowns/passes)*20;
		double f4 = 2.375 - ((interceptions/passes)*25);
		
		if(f1>2.375)
			f1 = 2.375;
		
		if(f2>2.375)
			f2 = 2.375;
		
		if(f3>2.375)
			f3 = 2.375;
		
		if(f4>2.375)
			f4 = 2.375;
		
		if(f1<0)
			f1 = 0;
		
		if(f2<0)
			f2 = 0;
		
		if(f3<0)
			f3 = 0;
		
		if(f4<0)
			f4 = 0;
		
		double rating = ((f1+f2+f3+f4)/6)*100;
		
		
		System.out.printf("The QB rating is %.2f ", rating);
		input.close();
}
}