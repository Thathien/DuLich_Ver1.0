package dulich.com.controller.user;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	private static final Logger LOGGER =LogManager.getLogger(HomeController.class);
	
	@GetMapping("/")
	public String index() {
		if(LOGGER.isInfoEnabled()) {
			LOGGER.info("HomeController get index");
		}
		LOGGER.debug("HomeController get index");
		return "user/index";
	}
}
