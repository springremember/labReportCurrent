public class DoubleExpression extends Expression{
    double result;

    DoubleExpression(double hmc){
        result = hmc;
    }

    @Override
    public double Interpret(Expression in) {
        System.out.print(result);
        return result;
    }
}
