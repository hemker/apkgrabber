package com.apkgetter.receiver;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.apkgetter.util.AlarmUtil;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EReceiver;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

@EReceiver
public class BootReceiver
	extends BroadcastReceiver
{
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Bean
	AlarmUtil alarmUtil;

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void onReceive(
		Context context,
		Intent intent
	) {
		alarmUtil.setAlarmFromOptions();
	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////