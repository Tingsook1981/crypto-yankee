package com.mobiledevelopment.cryptoyankee.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {

    public static String getCurrentDate() {
        return new SimpleDateFormat("yyyy-MM-ddThh-mm-ss").format(new Date());
    }
}

