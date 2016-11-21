package com.xyz.util;

import java.util.Date;
import org.apache.commons.lang.time.DateFormatUtils;

public class DateUtil {

        public static String getToday() {
		//marczewski

                String today = DateFormatUtils.format(new Date(), "dd-MMM-yyyy");
            //marczewski 2 kolejny commit
                return today;
        }
}