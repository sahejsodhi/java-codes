public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    
    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
    public double getAdditionResult() {
        double sum = (firstNumber + secondNumber);
        return sum;
    }
    public double getSubtractionResult() {
        double diff = (firstNumber - secondNumber);
        return diff;
    }
    public double getMultiplicationResult() {
        double product = (firstNumber * secondNumber);
        return product;
    }
    public double getDivisionResult() {
        if (secondNumber == 0) {
            return 0.0;
        }
        double quotient = (firstNumber / secondNumber);
        return quotient;
    }
    
      
}
