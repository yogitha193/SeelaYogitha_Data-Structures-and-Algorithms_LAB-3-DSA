package problem1.main;

import problem1.service.CheckingExpression;

public class BalancingBrackets {
	public static void main(String[] args) {
		CheckingExpression checkexpression = new CheckingExpression();
		String expression = "[()([])])";

		Boolean result;

		result = checkexpression.checkexpression(expression);

		if (result)
			System.out.println("The entered String has Balanced Brackets");

		else
			System.out.println("The entered String do not contain Balanced Brackets");

	}
}
