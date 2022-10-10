public class Main {
    public static void main(String[] args) {

//        GameCalculator gameCalculator = new KidsGameCalculator();
//        gameCalculator.calculate();
//        gameCalculator.over();
        GameCalculator[] gameCalculators = {new KidsGameCalculator(), new ManGameCalculator(), new WomanGameCalculator()};

        for (GameCalculator calculator: gameCalculators){
            calculator.calculate();
        }
    }
}