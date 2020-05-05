package com.greeting;

/**
 * 挨拶のインターフェース定義
 *
 * @author t.yoshida
 */
public interface Greeting
{
	/**
	 * 指定された言語をサポートするか否かを返す。
	 *
	 * @param lang 言語
	 * @return true: 指定言語をサポートする
	 */
	boolean isSupported(String lang);

	/**
	 * 朝の挨拶を返す。
	 *
	 * @return 朝の挨拶
	 */
	String getMorning();

	/**
	 * 昼下がりの挨拶を返す。
	 *
	 * @return 昼下がりの挨拶
	 */
	String getAfternoon();

	/**
	 * 夕方以降の挨拶を返す。
	 *
	 * @return 夕方以降の挨拶
	 */
	String getEvening();
}
