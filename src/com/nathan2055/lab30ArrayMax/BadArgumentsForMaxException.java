package com.nathan2055.lab30ArrayMax;


/**
 * Indicate that the arguments for max were bad. It is unchecked.
 * 
 */
public class BadArgumentsForMaxException extends RuntimeException
{
	public BadArgumentsForMaxException(String reason)
	{
		super(reason);
	}
}
