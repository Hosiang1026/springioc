import com.study.controller.SimpleFactory;
import com.study.service.Fruit;
import org.junit.Test;

/**
 * 测试简单工厂模式
 *
 * @author Howe Hsiang
 */
public class SimpleFactoryTest extends BaseTest {

    @Test
    public void getInstanceInfo() {
        Fruit apple = SimpleFactory.getInstance("apple");
        apple.eat();

        Fruit orange = SimpleFactory.getInstance("orange");
        orange.eat();
    }

}




