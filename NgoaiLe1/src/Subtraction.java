class Subtraction extends BinaryExpression {
    private Expression left;
    private Expression right;

    public Subtraction (Expression left, Expression right)
    {
        super(left, right);
    }

    @Override
    public Expression left() {
        return left;
    }

    @Override
    public Expression right() {
        return right;
    }

    @Override
    public String toString() {
        String s = "(" + left.toString() + " - " + right.toString() + ")";
        return s;
    }

    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }


}