package com.config;

import com.utils.PropertiesUtils;

public class LocalConfig {
	static PropertiesUtils propertiesUtils = new PropertiesUtils("local.properties");
	public static final String URL = propertiesUtils.getPropertieValue("url");
	public static final String CHOME_PATH = propertiesUtils.getPropertieValue("chormeDriverPath");
	public static final String FIREFOX_PATH = propertiesUtils.getPropertieValue("fireFoxDriverPath");
}
