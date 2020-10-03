package ge;

interface CalculatorService {

    void sum(int x, int y);
    void devide(int x, int y);
}

public class CalculatorServiceImpl implements CalculatorService{
    public static void main(String[] args) {
       CalculatorServiceImpl ex = new CalculatorServiceImpl();
       ex.sum(5,0);
       ex.devide(5,0);
    }

    @Override
    public void sum(int x, int y) {
        float jami = x + y;
        System.out.println(jami);
    }

    @Override
    public void devide(int x, int y) {
        try {
            int jami = x / y;
            System.out.println(jami);
        }catch (ArithmeticException e){
            System.out.println("Can not devide by zero");
        }
    }
}
