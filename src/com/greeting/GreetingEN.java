package com.greeting;

/**
 * 挨拶の実装（英語）
 *
 * @author t.yoshida
 */
class GreetingEN implements Greeting
{
	@Override
	public boolean isSupported(String lang)
	{
		return ("en".equals(lang));
	}

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
