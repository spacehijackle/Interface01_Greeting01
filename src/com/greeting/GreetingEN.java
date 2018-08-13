package com.greeting;

/**
 * 挨拶の実装（英語）
 *
 * @author t.yoshida
 */
public class GreetingEN implements Greeting
{
	@Override
	public String getMorning()
	{
		return "Hello!";
	}

	@Override
	public String getAfternoon()
	{
		return "Hi, How are you doing?";
	}

	@Override
	public String getEvening()
	{
		return "Hey, What’s up man?";
	}
}
