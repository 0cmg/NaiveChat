package org.cmg.study.naive.chat.ui.util;

/**
 * @CLassName Ids
 * @Description TODO
 * @Author cmg
 * @Date 2021/7/2 16:10
 * @Version 1.2
 **/
public class Ids {

    public static class ElementTalkId{
        public static String createTalkPaneId(String id){
            return "ElementTalkId_createTalkPaneId_" + id;
        }

        public static String analysisTalkPaneId(String id){
            return id.split("_")[2];
        }

        public static String createInfoBoxListId(String id){
            return "ElementTalkId_createInfoBoxListId_" + id;
        }

        public static String analysisInfoBoxListId(String id){
            return id.split("_")[2];
        }

        public static String createMsgDataId(String id){
            return "ElementTalkId_createMsgDataId" + id;
        }

        public static String analysisMsgDataId(String id){
            return id.split("_")[2];
        }

        public static String createMsgKetchId(String id){
            return "ELementTalkId_createMSgKetchId_" + id;
        }

        public static String analysisMsgKetchId(String id){
            return id.split("_")[2];
        }

        public static String createFriendGroupId(String id){
            return "ElementTalkId_createFriendGroupId_" + id;
        }
    }
}
