public class BracketExpression extends OpExpression {
    BracketExpression(){}

    BracketExpression(Expression in){
        this.left = in;
        this.right = in;
    }

    @Override
    public double Interpret(Expression in) {
        System.out.print("(");
        double inter = this.left.Interpret(in);
        System.out.print(")");
        return inter;
    }
}
