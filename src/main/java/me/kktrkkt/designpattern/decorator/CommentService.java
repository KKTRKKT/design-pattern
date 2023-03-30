package me.kktrkkt.designpattern.decorator;

import java.util.ArrayList;
import java.util.List;

public class CommentService {

    private final List<String> commentList = new ArrayList<>();

    public void addComment(String comment) {
        commentList.add(comment);
    }

    public List<String> getCommentList() {
        return commentList;
    }
}
