package todoApp.todoApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// dev branch
@RestController
public class Controller {
    @RequestMapping("/")
    public String example(){
        return "To-do Application !";
    }
}
