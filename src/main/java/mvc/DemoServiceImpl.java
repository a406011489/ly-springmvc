package mvc;

import com.ly.mvc.framework.annotations.LyService;

@LyService
public class DemoServiceImpl {
    public void demoServiceMethod(){
        System.out.println("demoServiceMethod 被执行");
    }
}
