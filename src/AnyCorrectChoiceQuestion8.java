public class AnyCorrectChoiceQuestion8 extends Question8 {
    private String[] correctChoices;

    @Override
    public void setAnswer(String correctResponse) {
        correctChoices = correctResponse.split(" ");
    }

    @Override
    public boolean checkAnswer(String response) {
        for (String choice : correctChoices) {
            if (response.trim().equalsIgnoreCase(choice.trim())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Provide any one of the correct choices.");
    }
}