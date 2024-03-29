package com.nathan2055.lab20RationalClass;

/**
 * ZeroDenominatorException - a runtime exception that signals there was a zero denominator
 * for a Rational number.
 * 
 */
public class ZeroDenominatorException extends RuntimeException
{

	public ZeroDenominatorException(String reason)
	{
		super(reason);
	}
}
