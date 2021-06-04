package com.capgemini.lambdaexpressionexamples;

public class LambdaExpressionForUserDefinedFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition ad = ()->{
			System.out.println("Addition="+(55+65));
		};
		ad.add();
		//Lambda with return type
		Substraction sub=()->{return (65-55);
	};
	float result=sub.sub();
	System.out.println("substraction of two nos="+result);
	sub.readValues();
	Substraction.display();
	//Lambda with return type and One parameter
	Message msg=(String m)->{
		return m+"Hello from Lambda";
	};
	String returnMsg=msg.printMessage("Hi..");
	System.out.println(returnMsg);
	}

}
