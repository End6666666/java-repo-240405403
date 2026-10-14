package nav.util;

public class NavigationSystem {

    /**
     * 基础导航方法
     * 优化点：使用 switch 表达式规整代码格式，优化了提示语句
     */
    public String navigate(String mode, String start, String end) {
        // 容错处理（保留不变）
        if (start == null || start.trim().isEmpty() || end == null || end.trim().isEmpty()) {
            return "导航失败：起点或终点不能为空";
        }

        // 优化：将 if-else 重构为 switch，提升可读性
        return switch (mode.toLowerCase()) {
            case "walk" -> "【步行导航】起点：" + start + "，终点：" + end + "。温馨提示：请沿人行道行走。";
            case "drive" -> "【驾车导航】起点：" + start + "，终点：" + end + "。祝您一路顺风！";
            default -> "【" + mode + "导航】起点：" + start + "，终点：" + end + "。";
        };
    }
}