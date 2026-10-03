package myspring.demo01.controller;
 import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloController {
 
    // 测试接口
    @GetMapping("/hello")
    public String hello() {
        return "VS Code + 运行成功！";
    }
}
