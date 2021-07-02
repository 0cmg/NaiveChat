package org.cmg.study.naive.chat.ui.view.chat.data;

/**
 * @CLassName TalkData
 * @Description TODO
 * @Author cmg
 * @Date 2021/7/2 16:36
 * @Version 1.2
 **/
public class TalkData {
    private String talkName;
    private String talkHead;

    public TalkData() {
    }

    public TalkData(String talkName, String talkHead) {
        this.talkName = talkName;
        this.talkHead = talkHead;
    }

    public String getTalkName() {
        return talkName;
    }

    public void setTalkName(String talkName) {
        this.talkName = talkName;
    }

    public String getTalkHead() {
        return talkHead;
    }

    public void setTalkHead(String talkHead) {
        this.talkHead = talkHead;
    }
}
