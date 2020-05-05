package com.greeting;

/**
 * 挨拶の実装（フランス語）
 *
 * @author t.yoshida
 */
class GreetingFR implements Greeting
{
	@Override
	public boolean isSupported(String lang)
	{
		return ("fr".equals(lang));
	}

	@Override
	public String getMorning()
	{
		return "Bonjour!";
	}

	@Override
	public String getAfternoon()
	{
		return "Bonjour!";
	}

	@Override
	public String getEvening()
	{
		return "Bonsoir!";
	}
}
