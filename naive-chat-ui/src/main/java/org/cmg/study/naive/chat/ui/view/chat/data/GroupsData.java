package org.cmg.study.naive.chat.ui.view.chat.data;

/**
 * @CLassName GroupsData
 * @Description TODO
 * @Author cmg
 * @Date 2021/7/2 16:31
 * @Version 1.2
 **/
public class GroupsData {
    /**
     * 群组ID
     */
    private String groupId;
    /**
     * 群组名称
     */
    private String groupName;
    /**
     * 群组头像
     */
    private String groupHead;

    public GroupsData() {
    }

    public GroupsData(String groupId, String groupName, String groupHead) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.groupHead = groupHead;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupHead() {
        return groupHead;
    }

    public void setGroupHead(String groupHead) {
        this.groupHead = groupHead;
    }
}
