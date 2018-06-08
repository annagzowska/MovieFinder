package rest;
@RestContoller
public class ErrorRestController implements ErrorController {

        @RequestMapping(path = "/error")
        public String error() {
            return "Error page";
        }

        @Override
        public String getErrorPath() {
            return "/error";
        }
    }
}
