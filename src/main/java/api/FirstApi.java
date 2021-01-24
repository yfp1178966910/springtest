package api;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * todo @Controller 与@RestController的区别是什么？似乎@Controller会返回jsp视图
 * 现象：@Controller 代码可以进来，但是报noHandler，@RestController正常
 */

@RestController
public class FirstApi {

    @RequestMapping(value = "/v1/fisrt-api", method = RequestMethod.GET, produces = "application/json")
    public String helloWorld() {
        return "hello world";
    }
}
