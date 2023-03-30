package me.kktrkkt.designpattern.decorator;

import java.util.List;

public interface CommentService {
    void addComment(String comment);

    List<String> getCommentList();
}
