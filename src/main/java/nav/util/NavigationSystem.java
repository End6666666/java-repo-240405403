package nav.util;

public class NavigationSystem {

    /**
     * 基础导航方法
     * 迭代说明：回退到 if-else 结构，并新增骑行和混合导航分支
     */
    public String navigate(String mode, String start, String end) {
        // 容错处理
        if (start == null || start.trim().isEmpty() || end == null || end.trim().isEmpty()) {
            return "导航失败：起点或终点不能为空";
        }

        // 【新增导航方案】在原有 if-else 结构中新增分支
        if ("walk".equalsIgnoreCase(mode)) {
            return "【步行导航】起点：" + start + "，终点：" + end + "。温馨提示：请沿人行道行走。";
        } else if ("drive".equalsIgnoreCase(mode)) {
            return "【驾车导航】起点：" + start + "，终点：" + end + "。祝您一路顺风！";
        } else if ("bike".equalsIgnoreCase(mode)) {      // 新增：骑行分支
            return "【骑行导航】起点：" + start + "，终点：" + end + "。请注意骑行安全。";
        } else if ("mixed".equalsIgnoreCase(mode)) {     // 新增：混合分支
            return "【混合导航】起点：" + start + "，终点：" + end + "。已为您规划公交+步行路线。";
        } else {
            return "【" + mode + "导航】起点：" + start + "，终点：" + end + "。";
        }
    }
}