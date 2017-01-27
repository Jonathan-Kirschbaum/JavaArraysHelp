import java.util.Scanner;
public class lab3{//start of class lab3
	public static void main(String[] args){//start of main method

	int player1Score = 0;
	int player2Score = 0;
	final int NUM_QUESTIONS = 10;

	Scanner keyboard=new Scanner(System.in);

	question[] triviaQuestion = new question[NUM_QUESTIONS];


triviaQuestion[0] = new question("What were the original lyrics for the song yesterday, by Paul McCartney?", "1:Tomorrow", "2:History", "3:Scrambled Eggs", "4:Sorrow",3);
triviaQuestion[1] = new question("What isnpired the hit Aerosmith song walk this way?","1:Pretty women","2:Excercise","3:The movie 'Young Frankenstein'","4:Dogs",3);
triviaQuestion[2] = new question("It was on April 16, 1974, that this British band played their first American concert at Denver's Regis College. Who were they?", "1:Queen",
					"2:Led Zeppelin","3:Black Sabbath","4:Deep Purple",1);
triviaQuestion[3] = new question("Who released the song 'Cecilia' in 1970?","1:Steely Dan", "2:John Lennon", "3: Bob Dylan", "4:Simon and Garfunkel",4);
triviaQuestion[4] = new question("Aside from re-issues, only one beatles album is made up exclusively of songs written by Lennon and McCartney.","1:Hard Day's Night","2:Revolver",
					"3:The White Album","4:The Wall",1);
triviaQuestion[5] = new question("How many more questions will I look up before making up nonsense?","1:1","2:2","3:3","4:Too late",4);
triviaQuestion[6] = new question("What number am I thinking of?","1:1","2:2","3:3","4:4",4);
triviaQuestion[7] = new question("What grade will I get in this class?","1:A","2:B","3:C","4:D",1);
triviaQuestion[8] = new question("How many dogs do I have?","1:1","2:2","3:3","4:4",3);
triviaQuestion[9] = new question("What is the answer to the meaning of life","1:42","2:Love","3:Happiness","4:Pizza",1);




	for(int index=0;index<triviaQuestion.length; index++){//start of loop
		System.out.println("Player One, enter the correct answer");
		System.out.println(triviaQuestion[index].getQuestion());
		System.out.println(triviaQuestion[index].getAnswer1());
		System.out.println(triviaQuestion[index].getAnswer2());
		System.out.println(triviaQuestion[index].getAnswer3());
		System.out.println(triviaQuestion[index].getAnswer4());
		System.out.println("Please enter the number of the correct answer:");
		int answer = keyboard.nextInt();
		keyboard.nextLine();




			System.out.println("Player Two, enter the correct answer");
			System.out.println(triviaQuestion[index].getQuestion());
			System.out.println(triviaQuestion[index].getAnswer1());
			System.out.println(triviaQuestion[index].getAnswer2());
			System.out.println(triviaQuestion[index].getAnswer3());
			System.out.println(triviaQuestion[index].getAnswer4());
			System.out.println("Please enter the number of the correct answer:");
			int answer2 = keyboard.nextInt();
			keyboard.nextLine();


			if(answer2==triviaQuestion[index].getCorrect())
				player2Score++;


			if(answer==triviaQuestion[index].getCorrect())
				player1Score++;
			}

	if(player1Score>player2Score)
		System.out.println("Player One wins with a score of" +player1Score +"to" +player2Score);

	if(player2Score>player1Score)
		System.out.println("Player Two wins with a score of" +player2Score +"to" +player1Score);

	if(player1Score==player2Score)
		System.out.println("You have tied with a score of "+player1Score +"\nvery impressive!");







	}//end of main method


	}//end of class lab3

	 class question{

		private String trivia;
		private String answer1;
		private String answer2;
		private String answer3;
		private String answer4;
		private int correct;

		public question(String trivia,
						String answer1,
						String answer2,
						String answer3,
						String answer4,
						int correct)
	{

		this.trivia=trivia;
		this.answer1=answer1;
		this.answer2=answer2;
		this.answer3=answer3;
		this.answer4=answer4;
		this.correct=correct;
	}

	public void setQuestion(String question){
		this.trivia=trivia;
	}
	public String getQuestion(){
		return trivia;
	}
	public void setAnswer1(String answer1){
		this.answer1=answer1;
	}
	public void setAnswer2(String answer2){
		this.answer2=answer2;
	}
	public void setAnswer3(String answer3){
		this.answer3=answer3;
	}
	public void setAnswer4(String answer4){
		this.answer4=answer4;
	}
	public String getAnswer1(){
		return answer1;
	}
	public String getAnswer2(){
		return answer2;
	}
	public String getAnswer3(){
		return answer3;
	}
	public String getAnswer4(){
		return answer4;
	}
	public void setCorrect(int correct){
		this.correct=correct;
	}
	public int getCorrect(){
		return correct;
	}




	}
















