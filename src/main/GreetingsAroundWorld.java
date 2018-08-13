package main;

import java.util.Calendar;
import java.util.Locale;

import com.greeting.Greeting;
import com.greeting.GreetingEN;
import com.greeting.GreetingJA;

/**
 * 国際化対応した（つもり）の挨拶プログラム
 *
 * @author t.yoshida
 */
public class GreetingsAroundWorld
{
	public static void main(String[] args)
	{
		/*
		 * 使用言語によって実装したクラスを選択
		 */
		Greeting greeting;
		String lang = Locale.getDefault().getLanguage();
		if(lang.equals("ja"))
		{
			greeting = new GreetingJA();
		}
		else
		{
			greeting = new GreetingEN();
		}

		/*
		 * 時間帯によって挨拶を変える
		 */
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		if(hour >= 5 && hour < 13)
		{
			// 午前の挨拶
			System.out.println(greeting.getMorning());
		}
		else if(hour >= 13 && hour < 17)
		{
			// 昼下がりの挨拶
			System.out.println(greeting.getAfternoon());
		}
		else
		{
			// 夕方以降の挨拶
			System.out.println(greeting.getEvening());
		}
	}
}
