package zh.com.test;

import org.springframework.test.context.ContextConfiguration;
import zh.com.bean.CDPlayerConfig;
@ContextConfiguration(classes=CDPlayerConfig.class)
public class test {

    private CDPlayerConfig cd;

    public void cdShouuldNotbeNull()
     {
        System.out.print(cd.toString()+"测试");
    }

}
