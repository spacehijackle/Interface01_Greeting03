package com.greeting;

import java.util.Locale;

/**
 * {@link Greeting} の実装クラスを生成するファクトリークラス
 *
 * @author t.yoshida
 */
public class GreetingFactory
{
	// Greeting 実装クラス配列
	private final static Greeting[] ARY_GREETING =
	{
		new GreetingJA(), new GreetingDE(), new GreetingFR(), new GreetingEN(),
	};

	/**
	 * ロケールを基に {@link Greeting} の実装クラスを生成して返す。
	 *
	 * @param locale ロケール
	 * @return 実装クラス
	 */
	public static Greeting create(Locale locale)
	{
		String lang = locale.getLanguage();

		Greeting supported = new GreetingEN();  // デフォルトの Greeting 実装の設定
		for(Greeting greeting : ARY_GREETING)
		{
			if(greeting.isSupported(lang))
			{
				supported = greeting;
				break;
			}
		}

		return supported;
	}
}
