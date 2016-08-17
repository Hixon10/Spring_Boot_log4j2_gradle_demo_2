package com.example;

import java.io.PrintStream;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class OutErrLogger
{
    public static void setOutAndErrToLog()
    {
        setOutToLog();
        setErrToLog();
    }

    public static void setOutToLog()
    {
        System.setOut(new PrintStream(new LoggerStream(Logger.getLogger("out"), Level.INFO, System.out)));
    }

    public static void setErrToLog()
    {
        System.setErr(new PrintStream(new LoggerStream(Logger.getLogger("err"), Level.ERROR, System.err)));
    }

}