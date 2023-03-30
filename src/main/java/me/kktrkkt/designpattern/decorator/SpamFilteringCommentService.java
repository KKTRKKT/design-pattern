package me.kktrkkt.designpattern.decorator;

import java.util.List;

public class SpamFilteringCommentService extends CommentServiceDecorator {

    public SpamFilteringCommentService(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        boolean isSpam = isSpam(comment);
        if (!isSpam) {
            this.commentService.addComment(comment);
        }
    }


    private boolean isSpam(String comment) {
        return comment.contains("http");
    }
}
