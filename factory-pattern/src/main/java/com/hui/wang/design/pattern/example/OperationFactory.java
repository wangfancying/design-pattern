package com.hui.wang.design.pattern.example;

/**
 * 简单工厂方法创建具体的操作符
 *
 * @author hui.wang09
 * @since 27 November 2018
 */
public class OperationFactory {

	public static Operation createOperation(OperatorEnum operator) {
		switch (operator) {
			case ADD:
				return new AddOperation();
			case SUB:
				return new SubOperation();
			case MUL:
				return new MulOperation();
		}
		return null;
	}
}
