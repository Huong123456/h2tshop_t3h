package application.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerThymeleaft {

		@RequestMapping(value="/")
		public String welcome(Model model) {
			//model.put("message", this.message);
			return "index";
		}
		@RequestMapping(value="/about")
		public String about(Model model) {
			//model.put("message", this.message);
			return "about";
		}
		
		@RequestMapping(value="/contact")
		public String contact(Model model) {
			//model.put("message", this.message);
			return "contact";
		}
		
		@RequestMapping(value="/icons")
		public String icons(Model model) {
			//model.put("message", this.message);
			return "icons";
		}
		@RequestMapping(value="/mens")
		public String mens(Model model) {
			//model.put("message", this.message);
			return "mens";
		}
		@RequestMapping(value="/single")
		public String single(Model model) {
			//model.put("message", this.message);
			return "single";
		}
		
		@RequestMapping(value="/typography")
		public String typography(Model model) {
			//model.put("message", this.message);
			return "typography";
		}
		
		@RequestMapping(value="/womens")
		public String womens(Model model) {
			//model.put("message", this.message);
			return "womens";
		}
		
		

}
