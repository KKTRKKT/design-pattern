package me.kktrkkt.designpattern.decorator;

import java.util.ArrayList;
import java.util.List;

public class DefaultCommentService implements CommentService {
    private final List<String> commentList = new ArrayList<>();

    @Override
    public void addComment(String comment) {
        commentList.add(comment);
    }

    @Override
    public List<String> getCommentList() {
        return commentList;
    }
}
