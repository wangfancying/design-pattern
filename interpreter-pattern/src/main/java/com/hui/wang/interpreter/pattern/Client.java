package com.hui.wang.interpreter.pattern;

/**
 * TODO completion javadoc.
 *
 * @author hui.wang09
 * @since 25 December 2018
 */
public class Client {

	public static void main(String[] args) {
		Context context = new Context();
		Variable x = new Variable("X");
		Variable y = new Variable("Y");
		Constant c = new Constant(true);
		context.assign(x, false);
		context.assign(y, true);

		Expression expression = new OrExpression(new AndExpression(c, x), new AndExpression(y, new NotExpression(x)));

		System.out.println("X=" + x.interpret(context));
		System.out.println("Y=" + y.interpret(context));
		System.out.println(expression.toString() + "=" + expression.interpret(context));
	}
}
