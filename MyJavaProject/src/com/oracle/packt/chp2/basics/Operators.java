package com.oracle.packt.chp2.basics;

public class Operators {
	/*
	 * An operator is a symbol that tells the compiler to perform specific
	 * mathematical or logical manipulations. C++ is rich in built-in operators and
	 * provide the following types of operators − Arithmetic Operators. Relational
	 * Operators.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 5;
		int num2 = 3;
		int num6 = 5;

		System.out.println("=======Arithmetic operators=========");

		System.out.println("num1:" + num1 + " num6:" + num6);
		// Arithmetic operators
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		System.out.println(num1 % num2);
		System.out.println(++num1); // adds
		System.out.println(--num2); // subtracts

		System.out.println("=======Relational operators=========");

		// Relational operators
		System.out.println(num1 == num2); // false

		if (num1 == num6) {
			System.out.println("true. they are equal");

		} else {

			// num1 becomes 6 since ++num1 was executed. Therefore FALSE!
			System.out.println("false. they are not equal");
			System.out.println("num1:" + num1 + " num6:" + num6);
		}
		System.out.println(num1 == num6); // false ++num1
		System.out.println(num1 != num2);
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);

		System.out.println("=======Relational operators with Integer=========");

		int i = 5;
		int j = 5;
		if (i == j) {
			System.out.println("true for int");
			System.out.println("i:" + i + " j:" + j);
		}
		Integer ii = 0;
		Integer jj = 0;
		if (ii.equals(jj)) {
			System.out.println("true for integer");
		}

		System.out.println("=======Bitwise operators=========");

		// Bitwise operators
		//https://www.baeldung.com/java-bitwise-operators
		System.out.println(num1 & num2);

		boolean var1 = true;
		boolean var2 = false;

		System.out.println("=======Logical operators=========");
		// Logical operators
		System.out.println(var1 && var2);
		System.out.println(var1 || var2);
		System.out.println("=======Assignment operators=========");
		// Assignment operators
		int num3 = 4;
		num3 += 8; // num3 = num3 + 8;
		System.out.println(num3);
		System.out.println("=======Conditional operator=========");
		// Conditional operator
		int num4 = 65;
		int num5 = 63;
		
		int result = (num4 == num5) ? 34 : 19;
		System.out.println(result);
	}

}
