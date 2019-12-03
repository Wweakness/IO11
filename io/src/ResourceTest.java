import org.junit.Test;

import java.io.InputStream;

public class ResourceTest {
    @Test
    public void test1(){
        //获取相对路径
       InputStream is= ResourceTest.class
               .getClassLoader()
               .getResourceAsStream("../../test1.txt"); //../表示返回上级目录

        System.out.println(is);

    }
}
