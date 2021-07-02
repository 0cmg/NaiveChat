package org.cmg.study.naive.chat.ui.util;

import org.cmg.study.naive.chat.ui.view.chat.element.group_bar_chat.ElementTalk;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @CLassName CacheUtil
 * @Description TODO
 * @Author cmg
 * @Date 2021/7/2 15:55
 * @Version 1.2
 **/
public class CacheUtil {
    public static Map<String, ElementTalk> talkMap = new ConcurrentHashMap<>(16);
}
