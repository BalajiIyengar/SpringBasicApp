/**
 * 
 */
package com.springbasics.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springbasics.util.JSPMappings;
import com.springbasics.util.LoggerConstants;
import com.springbasics.util.URLMappings;

/**
 * @author balaji i
 *
 */
@Controller
public class LoginController
{
	Log logger = LogFactory.getLog(getClass());
	
	/**
	 * @author balaji i
	 * @param httpServletRequest
	 * @param httpServletResponse
	 * @return LoginPage
	 */
	@RequestMapping(value=URLMappings.LOGIN_PAGE)
	public String showLoginPage(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse)
	{
		logger.info(LoggerConstants.LOGIN_PAGE);
		return JSPMappings.LOGIN_PAGE;
	}

}
