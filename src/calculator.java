public class calculator {

    public double a;
    public  double b;
    public  int operation;
    public double result;

    public  void setOperandOne(double number) {
        a = number;
    }
    public  void setOperandTwo(double number) {
        b = number;
    }
    public  void setOperation(String x) {
        if(x.equals("+")) {
            operation = 0;
        } else if (x.equals("-")) {
            operation = 1;
        } else {
            System.out.println("Not an option");
        }
    }

    public  void performOperation() {
        if (operation == 0) {
            result = a + b;
        } else if (operation == 1) {
            result = a - b;

        }
    }
    public double getResults() {
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        calculator myCalc = new calculator();
        myCalc.setOperandOne(10.5);
        myCalc.setOperation("+");
        myCalc.setOperandTwo(5.2);
        myCalc.performOperation();
        myCalc.getResults();
    }

}



