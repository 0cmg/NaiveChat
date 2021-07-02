package org.cmg.study.naive.chat.ui.view.chat.element.group_bar_chat;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import org.cmg.study.naive.chat.ui.util.DateUtil;
import org.cmg.study.naive.chat.ui.util.Ids;
import org.cmg.study.naive.chat.ui.view.chat.data.RemindCount;
import org.cmg.study.naive.chat.ui.view.chat.data.TalkBoxData;
import org.cmg.study.naive.chat.ui.view.chat.data.TalkData;
import sun.nio.cs.ext.MS874;

import java.util.Date;

/**
 * @CLassName ElementTalk
 * @Description TODO
 * @Author cmg
 * @Date 2021/7/2 15:57
 * @Version 1.2
 **/
public class ElementTalk {
    private Pane pane;

    private Label head;
    /**
     * 昵称区域
     */
    private Label nikeName;
    /**
     * 信息简述
     */
    private Label msgSketch;
    /**
     * 信息时间
     */
    private Label msgData;
    /**
     * 消息提醒
     */
    private Label msgRemind;
    /**
     * 删除对话框按钮
     */
    private Button delete;
    /**
     * 初始化填充消息对话框
     */
    private ListView<Pane> infoBoxList;

    public ElementTalk(String talkId, Integer talkType, String talkName, String talkHead, String talkSketch, Date talkDate) {
        pane = new Pane();
        pane.setId(Ids.ElementTalkId.createTalkPaneId(talkId));
        pane.setUserData(new TalkBoxData(talkId, talkType, talkName, talkHead));
        pane.setPrefSize(270, 80);
        pane.getStyleClass().add("talkElement");
        ObservableList<Node> children = pane.getChildren();

        //头像区域
        head = new Label();
        head.setPrefSize(50, 50);
        head.setLayoutX(15);
        head.setLayoutY(15);
        head.getStyleClass().add("element_head");
        head.setStyle(String.format("-fx-background-image: url('/fxml/chat/img/head/%s.png')", talkHead));
        children.add(head);

        //昵称区域
        nikeName = new Label();
        nikeName.setPrefSize(140, 25);
        nikeName.setLayoutX(80);
        nikeName.setLayoutY(15);
        nikeName.setText(talkName);
        nikeName.getStyleClass().add("element_nikeName");
        children.add(nikeName);

        //信息简述
        msgSketch = new Label();
        msgSketch.setId(Ids.ElementTalkId.createMsgKetchId(talkId));
        msgSketch.setPrefSize(200, 25);
        msgSketch.setLayoutX(80);
        msgSketch.setLayoutY(40);
        msgSketch.getStyleClass().add("element_msgKetch");
        children.add(msgSketch);

        //信息时间
        msgData = new Label();
        msgData.setId(Ids.ElementTalkId.createMsgDataId(talkId));
        msgData.setPrefSize(60, 25);
        msgData.setLayoutX(220);
        msgData.setLayoutY(15);
        msgData.getStyleClass().add("element_msgData");
        children.add(msgData);
        //填充：信息简述 & 信息时间
        fillMsgSketch(talkSketch, talkDate);

        //消息提醒
        msgRemind = new Label();
        msgRemind.setPrefSize(15, 15);
        msgRemind.setLayoutX(60);
        msgRemind.setLayoutY(5);
        msgRemind.setUserData(new RemindCount());
        msgRemind.setText("");
        msgRemind.setVisible(false);
        msgRemind.getStyleClass().add("element_msgRemind");
        children.add(msgRemind);

        //删除对话框按钮
        delete = new Button();
        delete.setVisible(false);
        delete.setPrefSize(4, 4);
        delete.setLayoutX(26);
        delete.setLayoutY(-8);
        delete.getStyleClass().add("element_delete");
        children.add(delete);

        //消息框【初始化，未装载】，承载对话消息内容，点击按钮时填充
        infoBoxList = new ListView<>();
        infoBoxList.setId(Ids.ElementTalkId.createInfoBoxListId(talkId));
        infoBoxList.setUserData(new TalkData(talkName, talkHead));
        infoBoxList.setPrefSize(850, 560);
        infoBoxList.getStyleClass().add("infoBoxStyle");
    }

    public Pane pane() {
        return pane;
    }

    public ListView<Pane> infoBoxList() {
        return infoBoxList;
    }

    public Button delete() {
        return delete;
    }

    public void fillMsgSketch(String talkSketch, Date talkDate) {
        if (null != talkSketch) {
            if (talkSketch.length() > 30) {
                talkSketch = talkSketch.substring(0, 30);
                msgSketch.setText(talkSketch);
            }
        }
        if (null == talkDate) {
            talkDate = new Date();
        }
        String talkSimpleDate = DateUtil.simpleDate(talkDate);
        msgData.setText(talkSimpleDate);
    }

    public void clearMsgSketch() {
        msgSketch.setText("");
    }

    public Label msgRemind() {
        return msgRemind;
    }
}
