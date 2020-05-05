package com.greeting;

/**
 * 挨拶の実装（ドイツ語）
 *
 * @author t.yoshida
 */
class GreetingDE implements Greeting
{
	@Override
	public boolean isSupported(String lang)
	{
		return ("de".equals(lang));
	}

	@Override
	public String getMorning()
	{
		return "Guten Morgen!";
	}

	@Override
	public String getAfternoon()
	{
		return "Guten Tag!";
	}

	@Override
	public String getEvening()
	{
		return "Guten Abend!";
	}
}
