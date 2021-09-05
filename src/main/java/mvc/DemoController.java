package mvc;

import com.ly.mvc.framework.annotations.LyAutowired;
import com.ly.mvc.framework.annotations.LyController;
import com.ly.mvc.framework.annotations.LyRequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@LyController
@LyRequestMapping("/ly/a")
public class DemoController {

    @LyAutowired
    private DemoServiceImpl demoServiceImpl;

    @LyRequestMapping("/b")
    public void demoMethod(String name, String age) {
        System.out.println("收到请求，参数name：" + name);
        System.out.println("收到请求，参数age：" + age);
        demoServiceImpl.demoServiceMethod();
        System.out.println("执行完方法");
    }
}
