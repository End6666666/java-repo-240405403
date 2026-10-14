package nav.util;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NavigationSystemTest {

    private NavigationSystem system;

    @BeforeEach
    public void setUp() {
        system = new NavigationSystem();
    }

    // 要求(1)：指定起点、终点导航正常返回
    @Test
    public void testWalkMode() {
        String result = system.navigate("walk", "A", "B");
        assertNotNull(result, "walk 模式不应返回 null");
        assertTrue(result.contains("步行"), "walk 模式应包含'步行'");
    }

    // 要求(2)：输入容错测试处理
    @Test
    public void testInvalidInput() {
        String result1 = system.navigate("walk", "", "B"); // 空起点
        assertTrue(result1.contains("不能为空"), "空起点应该提示导航失败");
        
        String result2 = system.navigate("walk", "A", null); // 空终点
        assertTrue(result2.contains("不能为空"), "空终点应该提示导航失败");
    }
}