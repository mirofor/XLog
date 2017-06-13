package com.mi.xlog;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;

/**
 * 应用程序调试LOG
 */
public class CCLog {

    private static String tag = "CCLog";

    private static String className;
    private static String methodName;
    private static int lineNumber;
    private static Boolean isDebug = true;

    public static void syncIsDebug(Context context) {
        if (isDebug == null) {
            isDebug = context.getApplicationInfo() != null && (context.getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
        }
    }

    public static void debug(boolean isEnable) {
        debug(tag, isEnable);
    }

    public static void debug(String logTag, boolean isEnable) {
        tag = logTag;
        isDebug = isEnable;
    }

    public static boolean isDebuggable() {
        return isDebug;
//        return  isDebug == null ? false : isDebug.booleanValue();

    }

    public static void e(String tag, String msg) {
        if (!isDebuggable()) {
            return;
        }
        Log.e(tag, msg);
    }


    public static void d(String tag, String msg) {
        if (!isDebuggable()) {
            return;
        }

        Log.d(tag, msg);
    }


    public static void w(String tag, String msg) {
        if (!isDebuggable()) {
            return;
        }
        Log.w(tag, msg);
    }


    public static void v(String tag, String msg) {
        if (!isDebuggable()) {
            return;
        }
        Log.v(tag, msg);
    }


    public static void i(String tag, String msg) {
        if (!isDebuggable()) {
            return;
        }
        Log.i(tag, msg);
    }


    private static String createLog(String log) {

        StringBuffer buffer = new StringBuffer();
        buffer.append("[");
        buffer.append(methodName);
        buffer.append(": ");
        buffer.append(lineNumber);
        buffer.append("] ");
        buffer.append(log);

        return buffer.toString();
    }

    private static void getMethodNames(StackTraceElement[] sElements) {
        className = sElements[1].getFileName();
        methodName = sElements[1].getMethodName();
        lineNumber = sElements[1].getLineNumber();
    }

    public static void e(String message) {
        if (!isDebuggable())
            return;

        // Throwable instance must be created before any methods
        getMethodNames(new Throwable().getStackTrace());
        Log.e(tag, className + createLog(message));
    }

    public static void i(String message) {
        if (!isDebuggable())
            return;

        getMethodNames(new Throwable().getStackTrace());
        Log.i(tag, className + createLog(message));
    }

    public static void d(String message) {
        if (!isDebuggable())
            return;

        getMethodNames(new Throwable().getStackTrace());
        Log.d(tag, className + createLog(message));
    }

    public static void v(String message) {
        if (!isDebuggable())
            return;

        getMethodNames(new Throwable().getStackTrace());
        Log.v(tag, className + createLog(message));
    }

    public static void w(String message) {
        if (!isDebuggable())
            return;

        getMethodNames(new Throwable().getStackTrace());
        Log.w(tag, className + createLog(message));
    }

    public static void wtf(String message) {
        if (!isDebuggable())
            return;

        getMethodNames(new Throwable().getStackTrace());
        Log.wtf(tag, className + createLog(message));
    }
}
