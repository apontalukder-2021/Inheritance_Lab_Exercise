
public class TestQuestion5 {
    public static void main(String[] args) {
        NumericQuestion5 question = new NumericQuestion5();
        question.setText("What is 2 + 2?");
        question.setAnswer(4.0);

        question.display();

        System.out.println(question.checkAnswer("4.0"));  // true
        System.out.println(question.checkAnswer("3.99")); // true
        System.out.println(question.checkAnswer("4.01")); // true
        System.out.println(question.checkAnswer("3.98")); // false
    }
}
