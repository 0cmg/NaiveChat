package org.cmg.study.naive.chat.ui.view.chat.element.group_bar_chat;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import org.cmg.study.naive.chat.ui.util.AutoSizeTool;

/**
 * @CLassName ElementInfoBox
 * @Description TODO
 * @Author cmg
 * @Date 2021/7/2 17:02
 * @Version 1.2
 **/
public class ElementInfoBox {
    private Pane pane;

    /**
     * 头像
     */
    private Pane head;
    /**
     * 昵称区
     */
    private Label nikeName;
    /**
     * 内容箭头
     */
    private Label infoContentArrow;
    /**
     * 内容
     */
    private TextArea infoContent;

    /**
     * @Author cmg
     * @Description //TODO 好友消息
     * @Date 2021/7/2 17:21
     * @Param [userNickName, userHead, msg, msgType]
     * @return javafx.scene.layout.Pane
     **/
    public Pane left(String userNickName, String userHead, String msg, Integer msgType){
        double autoHeight = AutoSizeTool.getHeight(msg);
        double autoWidth = AutoSizeTool.getWidth(msg);

        pane = new Pane();
        pane.setPrefSize(500, 50 + autoHeight);
        pane.getStyleClass().add("infoBoxElement");
        ObservableList<Node> children = pane.getChildren();

        //头像
        head = new Pane();
        head.setPrefSize(50,50);
        head.setLayoutX(15);
        head.setLayoutY(15);
        head.getStyleClass().add("box_head");
        head.setStyle(String.format("-fx-background-image: url('/fxml/chat/img/head/%s.png')", userHead));
        children.add(head);

        //昵称
        nikeName = new Label();
        nikeName.setPrefSize(450,20);
        nikeName.setLayoutX(75);
        nikeName.setLayoutX(5);
        nikeName.setText(userNickName);
        nikeName.getStyleClass().add("box_nikeName");
        children.add(nikeName);

        //箭头
        infoContentArrow = new Label();
        infoContentArrow.setPrefSize(5, 20);
        infoContentArrow.setLayoutX(75);
        infoContentArrow.setLayoutY(30);
        infoContentArrow.getStyleClass().add("box_infoContent_arrow");
        children.add(infoContentArrow);

        switch (msgType){
            case 0:
                //内容
                infoContent = new TextArea();
                infoContent.setPrefWidth(autoWidth);
                infoContent.setPrefHeight(autoHeight);
                infoContent.setLayoutX(80);
                infoContent.setLayoutY(30);
                infoContent.setWrapText(true);
                infoContent.setEditable(false);
                infoContent.setText(msg);
                infoContent.getStyleClass().add("box_infoContent_left");
                children.add(infoContent);
                break;
            case 1:
                Label infoContentFace = new Label();
                infoContentFace.setPrefWidth(60);
                infoContentFace.setPrefHeight(40);
                infoContentFace.setLayoutX(80);
                infoContentFace.setLayoutY(30);
                infoContentFace.setStyle(String.format("-fx-background-image: url('/fxml/face/img/%s.png');-fx-background-position: center center;-fx-background-repeat: no-repeat;-fx-background-color: #ffffff;-fx-border-width: 0 1px 1px 0;-fx-border-radius: 2px;-fx-background-radius: 2px;", msg));
                children.add(infoContentFace);
                break;
        }
        return pane;
    }

    /**
     * @Author cmg
     * @Description //TODO    个人消息
     * @Date 2021/7/2 17:22
     * @Param [userNickName 用户昵称, userHead 用户头像, msg 消息, msgType 类型：0文字消息、1-固定表情]
     * @return javafx.scene.layout.Pane
     **/
    public Pane right(String userNickName, String userHead, String msg, Integer msgType) {
        double autoHeight = AutoSizeTool.getHeight(msg);
        double autoWidth = AutoSizeTool.getWidth(msg);

        pane = new Pane();
        pane.setPrefSize(500, 50 + autoHeight);
        pane.setLayoutX(853);
        pane.setLayoutY(0);
        pane.getStyleClass().add("infoBoxElement");
        ObservableList<Node> children = pane.getChildren();

        // 头像
        head = new Pane();
        head.setPrefSize(50, 50);
        head.setLayoutX(770);
        head.setLayoutY(15);
        head.getStyleClass().add("box_head");
        head.setStyle(String.format("-fx-background-image: url('/fxml/chat/img/head/%s.png')", userHead));
        children.add(head);

        // 箭头
        infoContentArrow = new Label();
        infoContentArrow.setPrefSize(5, 20);
        infoContentArrow.setLayoutX(755);
        infoContentArrow.setLayoutY(15);
        infoContentArrow.getStyleClass().add("box_infoContent_arrow");
        children.add(infoContentArrow);

        switch (msgType){
            case 0:
                // 内容：文字
                infoContent = new TextArea();
                infoContent.setPrefWidth(autoWidth);
                infoContent.setPrefHeight(autoHeight);
                infoContent.setLayoutX(755 - autoWidth);
                infoContent.setLayoutY(15);
                infoContent.setWrapText(true);
                infoContent.setEditable(false);
                infoContent.setText(msg);
                infoContent.getStyleClass().add("box_infoContent_right");
                children.add(infoContent);
                break;
            case 1:
                Label infoContentFace = new Label();
                infoContentFace.setPrefWidth(60);
                infoContentFace.setPrefHeight(40);
                infoContentFace.setLayoutX(755 - 60);
                infoContentFace.setLayoutY(15);
                infoContentFace.setStyle(String.format("-fx-background-image: url('/fxml/face/img/%s.png');-fx-background-position: center center;-fx-background-repeat: no-repeat;-fx-background-color: #9eea6a;-fx-border-width: 0 1px 1px 0;-fx-border-radius: 2px;-fx-background-radius: 2px;", msg));
                children.add(infoContentFace);
                break;
        }

        return pane;
    }
}
