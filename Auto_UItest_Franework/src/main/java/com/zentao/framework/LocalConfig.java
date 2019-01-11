/**
 * 
 */
package com.zentao.framework;

/**
 * @author jrj
 * @version 1.0.0
 * @since 
 * 创建时间：2018年5月11日 上午11:04:58
 * 功能描述：
 * 邮箱地址：519028651@qq.com
 */

public class LocalConfig {
	static PropertiesUtils propertiesUtils = new PropertiesUtils("local.properties");
	public static final String URl =propertiesUtils.getPropretieValue("url");
	public static final String ChromeDriverPath =propertiesUtils.getPropretieValue("ChromeDriverPath");
}
