package me.kktrkkt.designpattern.decorator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommentServiceTest {

    @ParameterizedTest
    @MethodSource("isSpamFilteringWithIsTrimming")
    public void comment_test(boolean isEnabledSpamFiltering, boolean isEnabledTrimming) {
        CommentService commentService = new DefaultCommentService();

        if(isEnabledSpamFiltering){
            commentService = new SpamFilteringCommentServiceDecorator(commentService);
        }
        if(isEnabledTrimming){
            commentService = new TrimmingCommentServiceDecorator(commentService);
        }

        List<String> commentList = getCommentList(commentService);

        commentList.stream().forEach(System.out::println);

        assertTrue(commentList.contains("오징어게임"));
        if(isEnabledTrimming){
            assertTrue(commentList.contains("보는게 하는거 보다 재밌을 수가 없지"));
        }else{
            assertTrue(commentList.contains("보는게 하는거 보다 재밌을 수가 없지..."));
        }

        if(!isEnabledSpamFiltering){
            assertTrue(commentList.contains("http://kktrkkt.github.io"));
        }

    }

    private static Stream<Arguments> isSpamFilteringWithIsTrimming() {
        return Stream.of(
                Arguments.of(true, true),
                Arguments.of(true, false),
                Arguments.of(false, true),
                Arguments.of(false, false)
        );
    }

    private static List<String> getCommentList(CommentService commentService) {
        commentService.addComment("오징어게임");
        commentService.addComment("보는게 하는거 보다 재밌을 수가 없지...");
        commentService.addComment("http://kktrkkt.github.io");

        return commentService.getCommentList();
    }
}
