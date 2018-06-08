package rest;

import java.util.Map;

@Controller
public class AppRestController {

    @ResponseBody
    @RequestMapping(path = "/test")
    public String test() {
        return "ok";
    }

    @RequestMapping(path = "/find", method = RequestMethod.GET)
    public String getAllMovies(Map<String, Object> model) {
        return "find";
    }
}
