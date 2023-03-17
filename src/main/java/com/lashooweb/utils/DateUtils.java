package com.lashooweb.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

	public static String ConvertDateToMMddyyyy(Date inputDate) {

		//Specifying the format of the date using SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");   

		//Formatting the date to the specified format
		String returnedDate = sdf.format(inputDate);

		return returnedDate;

	}

}
