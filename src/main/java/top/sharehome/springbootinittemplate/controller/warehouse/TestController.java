package top.sharehome.springbootinittemplate.controller.warehouse;


import cn.dev33.satoken.annotation.SaCheckLogin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.sharehome.springbootinittemplate.common.base.R;

@RestController
@RequestMapping("/test")
@SaCheckLogin
public class TestController {

    @PostMapping("testPost")
    public R<String> test(){
        return R.ok("TEST");
    }

}
