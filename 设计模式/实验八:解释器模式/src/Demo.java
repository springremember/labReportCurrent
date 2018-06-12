public class Demo {
    public static void main(String[] args){
        Expression d1 = new DoubleExpression(3);
        Expression d2 = new DoubleExpression(4);
        Expression d3 = new DoubleExpression(6);
        Expression d4 = new DoubleExpression(7);
        Expression d5 = new DoubleExpression(2);


        Expression mul = new MulExpression(d2,d3);
        Expression b1 = new BracketExpression(mul);
        Expression div = new DivExpression(d4,d5);
        Expression b2 = new BracketExpression(div);
        Expression sub = new SubExpression(b1,b2);
        Expression b3 = new BracketExpression(sub);
        Expression add = new AddExpression(d1,b3);
        add.Interpret(add);

    }
}
