package nav.util;

public class NavigationSystem {
    
    public String navigate(String mode, String start, String end) {
        // 要求(2)：输入容错测试处理（此逻辑参考了AI的审查建议）
        if (start == null || start.trim().isEmpty() || end == null || end.trim().isEmpty()) {
            return "导航失败：起点或终点不能为空";
        }
        
        if ("walk".equalsIgnoreCase(mode)) {
            return "使用步行模式，从" + start + "导航到" + end;
        }
        return "使用" + mode + "模式，从" + start + "导航到" + end;
    }
}