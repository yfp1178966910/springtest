package api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class FirstApi {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
