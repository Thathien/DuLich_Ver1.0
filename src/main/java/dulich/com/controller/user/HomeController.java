package dulich.com.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	private static final Logger LOGGER = LogManager.getLogger(HomeController.class);

	@GetMapping(value = { "/", "/index" })
	public String index(HttpServletRequest servletRequest, HttpServletResponse response) {
		if (LOGGER.isInfoEnabled()) {
			LOGGER.info("HomeController get index");
//			LOGGER.debug(servletRequest.getRemoteAddr() + " is conecting to HomeController get index");
		}

		return "user/index";
	}
}
