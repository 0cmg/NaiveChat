package org.cmg.study.naive.chat.ui.view.chat.data;

/**
 * @CLassName RemindCount
 * @Description TODO
 * @Author cmg
 * @Date 2021/7/2 16:33
 * @Version 1.2
 **/
public class RemindCount {

    /**
     * 消息提醒条数
     */
    private int count = 0;

    public RemindCount() {
    }

    public RemindCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
