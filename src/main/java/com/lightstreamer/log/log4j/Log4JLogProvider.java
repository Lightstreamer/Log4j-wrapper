/*
 * Copyright (c) 2004-2015 Weswit s.r.l., Via Campanini, 6 - 20124 Milano, Italy.
 * All rights reserved.
 * www.lightstreamer.com
 *
 * This software is the confidential and proprietary information of
 * Weswit s.r.l.
 * You shall not disclose such Confidential Information and shall use it
 * only in accordance with the terms of the license agreement you entered
 * into with Weswit s.r.l.
 */
package com.lightstreamer.log.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;

import com.lightstreamer.log.Logger;
import com.lightstreamer.log.LoggerProvider;

/**
 * 
 */
public class Log4JLogProvider implements LoggerProvider {

  @Override
  public Logger getLogger(String category) {
    return new Log4jLogger(LogManager.getLogger(category));
  }
  
  
  private class Log4jLogger implements Logger {

    private org.apache.log4j.Logger logger;

    public Log4jLogger(org.apache.log4j.Logger logger) {
     this.logger = logger;
    }

    @Override
    public void error(String line) {
      logger.error(line);
    }

    @Override
    public void error(String line, Throwable exception) {
      logger.error(line,exception);
    }

    @Override
    public void warn(String line) {
      logger.warn(line);
    }

    @Override
    public void warn(String line, Throwable exception) {
      logger.warn(line,exception);
    }

    @Override
    public void info(String line) {
      logger.info(line);
    }

    @Override
    public void info(String line, Throwable exception) {
      logger.info(line,exception);
    }

    @Override
    public void debug(String line) {
      logger.debug(line);
    }

    @Override
    public void debug(String line, Throwable exception) {
      logger.debug(line,exception);
    }

    @Override
    public void fatal(String line) {
      logger.fatal(line);
    }

    @Override
    public void fatal(String line, Throwable exception) {
      logger.fatal(line,exception);
    }

    @Override
    public boolean isDebugEnabled() {
      return logger.isDebugEnabled();
    }

    @Override
    public boolean isInfoEnabled() {
      return logger.isInfoEnabled();
    }

    @Override
    public boolean isWarnEnabled() {
      return logger.isEnabledFor(Level.WARN);
    }

    @Override
    public boolean isErrorEnabled() {
      return logger.isEnabledFor(Level.ERROR);
    }

    @Override
    public boolean isFatalEnabled() {
      return logger.isEnabledFor(Level.FATAL);
    }
    
    
  }

}

