package com.test.readXlsx;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class logDemo {
	private static Logger logger = LogManager.getLogger(logDemo.class.getName());
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.fatal("fatal致命错误信息");
		logger.error("error错误信息");
		logger.debug("debug调试信息");
		logger.warn("warn警告信息");
		logger.info("info系统信息");
		logger.trace("trace轨迹");
	}

}
