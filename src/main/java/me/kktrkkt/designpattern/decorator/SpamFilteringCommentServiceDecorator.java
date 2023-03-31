package me.kktrkkt.designpattern.decorator;

public class SpamFilteringCommentServiceDecorator extends CommentServiceDecorator {

    public SpamFilteringCommentServiceDecorator(CommentService commentService) {
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
