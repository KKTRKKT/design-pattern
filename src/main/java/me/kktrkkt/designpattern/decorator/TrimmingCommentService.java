package me.kktrkkt.designpattern.decorator;

public class TrimmingCommentService extends CommentServiceDecorator {

    public TrimmingCommentService(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        this.commentService.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }

}
