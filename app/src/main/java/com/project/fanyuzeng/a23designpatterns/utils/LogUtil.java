package com.project.fanyuzeng.a23designpatterns.utils;

import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogUtil
{
	
	public static boolean mEnableLog = true;
	public static boolean mEnableFileLog = true;
	public static boolean mDebug = true;
	public static String mDirpath;
	public static String mFilename;
	private static boolean mIsAlreadyCheck = false;
	private static final long MAX_FILE_SIZE = 100 * 1024;
	public static final String TAG = "===23designpatterns===";
	private static final String DIR_NAME = Environment.getExternalStorageDirectory() + "/ppysdk/log/";

	private static final String FILE_NAME = "push_message_log.txt";

	private static final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//	private static ThreadPool mThreadPool = new ThreadPool(1);

	public static void e(String tag, String msg)
	{
		if (mEnableLog)
		{
			if (mDebug) {
				Log.e(TAG, tag + " " + msg);
			} else {
				Log.e(tag, msg);
			}
			if (mEnableFileLog)
				log(tag+" "+msg);
		}
	}
	
	public static void e(String tag, String msg, Throwable tr)
	{
		if (mEnableLog)
		{
			if (mDebug) {
				Log.e(TAG, tag + " " + msg, tr);
			} else {
				Log.e(tag, msg, tr);
			}
			if (mEnableFileLog)
				log(tag+" "+msg+ " "+tr.getMessage());
		}
	}
	
	public static void d(String tag, String msg)
	{
		if (mEnableLog)
		{
			if (mDebug) {
				Log.d(TAG, tag + " " + msg);
			} else {
				Log.d(tag, msg);
			}
			if (mEnableFileLog)
				log(tag+" "+msg);
		}
	}
	
	public static void d(String tag, String msg, Throwable tr)
	{
		if (mEnableLog)
		{
			if (mDebug) {
				Log.d(TAG, tag + " " + msg, tr);
			} else {
				Log.d(tag, msg, tr);
			}
			if (mEnableFileLog)
				log(tag+" "+msg+ " "+tr.getMessage());
		}
	}
	
	public static void i(String tag, String msg)
	{
		if (mEnableLog)
		{
			if (mDebug) {
				Log.i(TAG, tag + " " + msg);
			} else {
				Log.i(tag, msg);
			}
			if (mEnableFileLog)
				log(tag+" "+msg);
		}
	}
	
	public static void i(String tag, String msg, Throwable tr)
	{
		if (mEnableLog)
		{
			if (mDebug) {
				Log.i(TAG, tag + " " + msg, tr);
			} else {
				Log.i(tag, msg, tr);
			}
			if (mEnableFileLog)
				log(tag+" "+msg+ " "+tr.getMessage());
		}
	}
	
	public static void v(String tag, String msg)
	{
		if (mEnableLog)
		{
			if (mDebug) {
				Log.v(TAG, tag + " " + msg);
			} else {
				Log.v(tag, msg);
			}
			if (mEnableFileLog)
				log(tag+" "+msg);
		}
	}
	
	public static void v(String tag, String msg, Throwable tr)
	{
		if (mEnableLog)
		{
			if (mDebug) {
				Log.v(TAG, tag + " " + msg, tr);
			} else {
				Log.v(tag, msg, tr);
			}
			if (mEnableFileLog)
				log(tag+" "+msg+ " "+tr.getMessage());
		}
	}
	
	public static void w(String tag, String msg)
	{
		if (mEnableLog)
		{
			if (mDebug) {
				Log.w(TAG, tag + " " + msg);
			} else {
				Log.w(tag, msg);
			}
			if (mEnableFileLog)
				log(tag+" "+msg);
		}
	}
	
	public static void w(String tag, Throwable tr)
	{
		if (mEnableLog)
		{
			if (mDebug) {
				Log.w(TAG, tr);
			} else {
				Log.w(tag, tr);
			}
			if (mEnableFileLog)
				log(tag+" "+tr.getMessage());
		}
	}
	
	public static void w(String tag, String msg, Throwable tr)
	{
		if (mEnableLog)
		{
			if (mDebug) {
				Log.w(TAG, tag + " " + msg, tr);
			} else {
				Log.w(tag, msg, tr);
			}
			if (mEnableFileLog)
				log(tag+" "+msg+ " "+tr.getMessage());
		}
	}
	
	public static void wtf(String tag, String msg)
	{
		if (mEnableLog)
		{
			if (mDebug) {
				Log.wtf(TAG, tag + " " + msg);
			} else {
				Log.wtf(tag, msg);
			}
			if (mEnableFileLog)
				log(tag+" "+msg);
		}
	}
	
	public static void wtf(String tag, Throwable tr)
	{
		if (mEnableLog)
		{
			if (mDebug) {
				Log.wtf(TAG, tr);
			} else {
				Log.wtf(tag, tr);
			}
			if (mEnableFileLog)
				log(tag+" "+tr.getMessage());
		}
	}
	
	public static void wtf(String tag, String msg, Throwable tr)
	{
		if (mEnableLog)
		{
			if (mDebug) {
				Log.wtf(TAG, tag + " " + msg, tr);
			} else {
				Log.wtf(tag, msg, tr);
			}
		}
	}

	private static File validateLogFile(){
		if (mDirpath == null || mDirpath == "")
			mDirpath = DIR_NAME;
		File dir = new File(mDirpath);
		if (!dir.exists()) {
			if (!dir.mkdirs())
				return null;
		}

		if (mFilename == null || mFilename == "")
			mFilename = FILE_NAME;
		File logFile = new File(dir, mFilename);
		if (mIsAlreadyCheck)
			return logFile;
		if (!logFile.exists()) {
			try {
				logFile.createNewFile();

				mIsAlreadyCheck = true;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}
		else
		{
			mIsAlreadyCheck = true;
			try {
				FileInputStream fis = null;
				fis = new FileInputStream(logFile);
				long size = fis.available();
				if (size > MAX_FILE_SIZE)
				{
					logFile.delete();
					logFile.createNewFile();
				}
			}
			catch (Exception e){
				e.printStackTrace();
			}
		}

		return logFile;
	}
	public static void log(final String message){
		final File logFile = validateLogFile();
		if (logFile == null) {
			return;
		}

		Date curDate = new Date(System.currentTimeMillis());//获取当前时间
		final String msg = formatter.format(curDate) + " " + TAG+message;
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				FileWriter writer = null;
				try {
					writer = new FileWriter(logFile, true);
					writer.write(msg + "\n");
					writer.flush();

				} catch (Exception e) {

				}
				finally {
					if (writer != null) {
						try {
							writer.close();
						}
						catch (Exception e){}
					}
				}
			}
		};

//		mThreadPool.execute(runnable);
	}

}
