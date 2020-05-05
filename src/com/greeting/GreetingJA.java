package com.greeting;

/**
 * 挨拶の実装（日本語）
 *
 * @author t.yoshida
 */
class GreetingJA implements Greeting
{
	@Override
	public boolean isSupported(String lang)
	{
		return ("ja".equals(lang));
	}

	@Override
	public String getMorning()
	{
		return "おはようさんどす";
	}

	@Override
	public String getAfternoon()
	{
		return "ごきげんさんどす";
	}

	@Override
	public String getEvening()
	{
		return "おばんどす";
	}
}
