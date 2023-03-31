package me.kktrkkt.designpattern.decorator;

public class TrimmingCommentServiceDecorator extends CommentServiceDecorator {

    public TrimmingCommentServiceDecorator(CommentService commentService) {
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
