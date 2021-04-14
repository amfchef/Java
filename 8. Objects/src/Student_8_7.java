import java.util.ArrayList;

/**
 * Implement a class Student. For the purpose of this exercise, a student has a
 * name and a total quiz score. Supply an appropriate constructor and methods
 * getName()
 * addQuiz(int score)
 * getTotalScore()
 * getAverageScore()
 * To compute the latter, you also need to store the number of quizzes that the
 * student took.
 * 
 * @version 11-09-2020
 * @author Jakob Johansson <a href = "20jajo02@hig.se">20jajo02@hig.se </a>
 */
public class Student_8_7 {

	public Student_8_7() {

	}
	private String name = "Jakob";
	private double totalQuizScore = 0;

	
	private ArrayList<Integer> scores= new ArrayList<Integer>();

	public void getName() {
		System.out.println("The name of the student is:\t\t" + name);
	}
	public void addQuiz(int score) {
		scores.add(score);
		System.out.print(scores.get(scores.size()-1) + " ");
	}
	public void getTotalScore() {
		for (int i = 0; i < scores.size(); i++) {
			totalQuizScore = totalQuizScore + scores.get(i);
		}
		System.out.print(totalQuizScore);
	}

	public void getAverageScore() {
		double averageScore = totalQuizScore / scores.size();
		System.out.printf("%.2f", averageScore);
	}
	
}
