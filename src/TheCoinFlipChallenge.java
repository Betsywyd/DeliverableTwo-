import java.util.Scanner;
import java.util.Random;
public class TheCoinFlipChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("Welcome to the COIN FLIP CHALLENGE!");
     Scanner obj=new Scanner(System.in);
     System.out.println("What is your name?");
     String name=obj.nextLine();
     System.out.println("Welcome "+name+". Do you want to do the COIN FLIP CHALLENGE? Yes/No");
     String answer1=obj.nextLine().toLowerCase();
     float score=0;
	 if(answer1.equals("no")) {
		 System.out.println("You are a coward "+name);
	 }else if (answer1.equals("yes")){
		 
		for(int i=0;i<5;i++) {
			Random random=new Random();
			int rand=random.nextInt(2);
	
			System.out.println("Heads or Tails?");
			String answer2=obj.nextLine().toLowerCase();
			if(rand==1&&answer2.equals("heads")) {
				System.out.println("Correct!");
				score++;
			}else if(rand==0&&answer2.equals("tails")) {
				System.out.println("Correct!");
				score++;
			}else {
				System.out.println("Wrong!");
			}
		}
		float accuracy=score/5;
		System.out.println("Thank you "+name+". You got a score of "+score+"!");
		System.out.println("You accuracy is "+(int)(accuracy*100)+"%"+"!");
		}
		
	}

}
