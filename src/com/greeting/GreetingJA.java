package com.greeting;

/**
 * 挨拶の実装（日本語）
 *
 * @author t.yoshida
 */
public class GreetingJA implements Greeting
{
	@Override
	public String getMorning()
	{
		return "おはようございます";
	}

	@Override
	public String getAfternoon()
	{
		return "こんにちは";
	}

	@Override
	public String getEvening()
	{
		return "こんばんわ";
	}
}
