package com.springmvc.messageconverter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.expression.ParseException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.springmvc.util.StringUtil;

/**
 * 自定义jackson 日期序列化
 *
 * ClassName: EnumTestJsonSerializer
 * 
 * @Description: jackson 日期序列化
 *
 * @author yangyu
 * @date 2016年2月19日17:09:39
 * @version
 */
public class DateJsonDeserializer extends JsonDeserializer<Date> {
	private static final String DATE_PATTERN_MINUTE = "yyyy-MM-dd HH:mm";
	private static final String DATE_PATTERN_HOUR = "yyyy-MM-dd HH";
	private static final String DATE_PATTERN_DEFAULT = "yyyy-MM-dd HH:mm:ss";
	private static final String DATE_PATTERN_DAY = "yyyy-MM-dd";
	private static final String DATE_PATTERN_DAY_SLASH = "MM/dd/yyyy";
	private boolean allowEmpty = true;

	@Override
	public Date deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String text = p.getText();
		if (this.allowEmpty && StringUtil.isBlank(text)) {
			return null;
		} else {
			try {
				Date date = null;
				boolean flag = false;
				try {
					date = stringToDate(text, DATE_PATTERN_DEFAULT);
					flag = true;

				} catch (Exception e) {
				}
				if (!flag) {
					try {
						date = stringToDate(text, DATE_PATTERN_DAY);
						flag = true;
					} catch (Exception e) {
					}
				}
				if (!flag) {
					try {
						date = stringToDate(text, DATE_PATTERN_MINUTE);
						flag = true;
					} catch (Exception e) {
					}
				}
				if (!flag) {
					try {
						date = stringToDate(text, DATE_PATTERN_HOUR);
						flag = true;
					} catch (Exception e) {
					}
				}

				if (!flag) {
					try {
						date = stringToDate(text, DATE_PATTERN_DAY_SLASH);
						flag = true;
					} catch (Exception e) {
					}
				}

				return date;
			} catch (ParseException ex) {
				throw new IllegalArgumentException("Could not parse date: "
						+ ex.getMessage(), ex);
			}
		}
	}

	/**
	 * 将字符串转化为日期。 字符串格式("YYYY-MM-DD")。
	 * 例如："2012-07-01"或者"2012-7-1"或者"2012-7-01"或者"2012-07-1"是等价的。
	 * 
	 * @throws java.text.ParseException
	 */
	public static Date stringToDate(String str, String pattern)
			throws java.text.ParseException {
		Date dateTime = null;
		SimpleDateFormat formater = new SimpleDateFormat(pattern);
		dateTime = formater.parse(str);
		return dateTime;
	}

	/**
	 * 将日期转化为字符串
	 */
	public static String dateToString(Date date, String pattern) {
		String str = "";
		try {
			SimpleDateFormat formater = new SimpleDateFormat(pattern);
			str = formater.format(date);
		} catch (Throwable e) {
		}
		return str;
	}

}
