package top.linjiyang.assistant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.linjiyang.assistant.entity.User;

/**
 * @Description 演示controller
 * @Author linjiyang
 * @Date 2022/3/10 21:24
 * @Version 1.0
 */

@RestController
@RequestMapping("test")
public class DemoController {

    @GetMapping("hello")
    public Object Hello() {
        User user = new User();
        user.setUsername("徐冉");
        user.setAge(25);
        user.setAddr("北京市冉二狗");
        return user;
    }

}
