public class AnyCorrectChoiceQuestionTest8 {
    public static void main(String[] args) {
        AnyCorrectChoiceQuestion8 question = new AnyCorrectChoiceQuestion8();
        question.setText("What is one of the primary colors?");
        question.setAnswer("red blue yellow");

        question.display();

        System.out.println("Your answer: blue");
        System.out.println("Correct? " + question.checkAnswer("blue"));

        System.out.println("Your answer: green");
        System.out.println("Correct? " + question.checkAnswer("green"));

        System.out.println("Your answer: yellow");
        System.out.println("Correct? " + question.checkAnswer("yellow"));
    }
}