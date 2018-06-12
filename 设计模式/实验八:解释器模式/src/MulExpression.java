public class MulExpression extends OpExpression{
    MulExpression(Expression left,Expression right){
        this.left = left;
        this.right = right;
    }

    MulExpression(){}

    @Override
    public double Interpret(Expression in) {
        double left = this.left.Interpret(in);
        System.out.print(" * ");
        double right = this.right.Interpret(in);
        double temp = left * right;
        if (this == in){
            System.out.print(" = ");
            System.out.print(temp);
    }
    return temp;
}
}
