package notes.mvc.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description：
 *
 * @author zzy520git
 * @date 2020/1/9 11:21
 * @ see
 * @since
 */
@RestController
@RequestMapping("/provider")
public class IndexController {
    public static volatile boolean alive = true;

    @RequestMapping("/index")
    public String sayHi() {
        return "心想事成，万事如意，家和万事兴-b2c";
    }


    @RequestMapping("/feigntest")
    public String sayHello() {
        return "feigntest-测试feign-b2c";
    }

    @RequestMapping("/alive")
    public String switchAlive() {
        alive = !alive;
        return String.valueOf(alive);
    }
}
