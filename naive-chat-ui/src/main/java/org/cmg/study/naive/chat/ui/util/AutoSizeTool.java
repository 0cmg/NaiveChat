package org.cmg.study.naive.chat.ui.util;

/**
 * @CLassName AutoSizeTool
 * @Description TODO
 * @Author cmg
 * @Date 2021/7/2 15:46
 * @Version 1.2
 **/
public class AutoSizeTool {
    public static double getWidth(String msg) {
        int len = msg.length();
        double width = 0;
        for (int i = 0; i < len; i++) {
            if (isChinese(msg.charAt(i))) {
                width += 16;
            } else {
                width += 16;
            }
        }

        // 补全前后空格
        width += 22;

        if (width > 450) {
            return 450;
        }

        return width < 50 ? 50 : width;
    }

    public static double getHeight(String msg) {
        int len = msg.length();
        double width = 0;
        for (int i = 0; i < len; i++) {
            if (isChinese(msg.charAt(i))) {
                width += 16;
            } else {
                width += 16;
            }
        }
        //// 补全前后空格
        width += 22;

        double remainder = width % 450;
        int line = (int) (width / 450);

        if (remainder != 0) {
            line += 1;
        }

        double autoHeight = line * 24 + 10;

        return autoHeight < 30 ? 30 : autoHeight;
    }

    public static boolean isChinese(char c) {
        Character.UnicodeBlock ub = Character.UnicodeBlock.of(c);
        return ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS
                || ub == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A
                || ub == Character.UnicodeBlock.GENERAL_PUNCTUATION
                || ub == Character.UnicodeBlock.CJK_SYMBOLS_AND_PUNCTUATION
                || ub == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS;
    }
}
