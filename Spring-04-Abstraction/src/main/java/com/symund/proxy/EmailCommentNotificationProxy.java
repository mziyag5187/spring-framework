package com.symund.proxy;

import com.symund.model.Comment;
import org.springframework.stereotype.Component;

@Component
public class EmailCommentNotificationProxy implements CommentNotificationProxy{

    @Override
    public void sendComment(Comment comment) {
        System.out.println("Sending notifications for comment : " + comment.getText());
    }
}
