package com.example.alarmproject.services;

import android.content.Context;

import com.example.alarmproject.model.Alarm;

import java.util.ArrayList;
import java.util.List;

public class SharedPreferences {

    private static final String ID_PREF = "mathias";

    public static List<Alarm> getAlarms(Context context ){

        List<Alarm> alarms = new ArrayList<>();

        return alarms;

    }

    public static void setAlarms (List<Alarm> alarms) {

    }
}
