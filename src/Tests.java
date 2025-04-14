import java.util.Scanner;

public class Tests{
    private double ave;
    private int count;
    private int score;
    private double sum;

    public Tests(){
        ave = 0;
        count = 0;
        score = 0;
        sum = 0;
    }

    public void getAverage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter test scores (press -1 to quit): ");
        int inputScore = scanner.nextInt();

        while (inputScore != -1){
            setScore(inputScore);
            sum += score;
            count++;
            System.out.println("Enter test scores (press -1 to quit): ");
            inputScore = scanner.nextInt();
        }
        if (count > 0) {
            ave = sum / count;
        }
    }

    public double getAve(){
        return ave;
    }

    public int getCount(){
        return count;
    }

    public int getScore(){
        return score;
    }

    public void setScore(int newScore){
        this.score = newScore;
    }

    public String toString(){
        return "The average of the " + count + " scores entered is " + Math.round(ave * 100.00) / 100.00;
    }
}