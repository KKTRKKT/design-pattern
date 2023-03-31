package me.kktrkkt.designpattern.decorator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ClientTest {

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

    private List<String> getCommentList(CommentService commentService) {
        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://kktrkkt.github.io");

        return client.readCommentList();
    }
}
