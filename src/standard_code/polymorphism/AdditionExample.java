package standard_code.polymorphism;

abstract class Operation {
    private int operand1;
    private int operand2;

    public Operation(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public int getOperand1(){
        return operand1;
    }

    public int getOperand2(){
        return operand2;
    }

    public abstract int performOperation();

    public void display() {
        System.out.println("Operand 1: " + operand1);
        System.out.println("Operand 2: " + operand2);
    }

    protected void finalize() {
        System.out.println("Operation destroyed: " + getClass().getSimpleName());
    }


}

class Addition extends Operation {
    public Addition(int operand1, int operand2) {
        super(operand1, operand2);
    }



    public int performOperation() {
        return getOperand1() + getOperand2();
    }
}

public class AdditionExample {
    public static void main(String[] args) {
        Operation addition = new Addition(5, 3);
        addition.display();
        System.out.println("Result: " + addition.performOperation());
    }
}
