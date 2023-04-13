package me.kktrkkt.designpattern.iterator;

import java.util.*;

public class Board {

    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public Iterator<Post> getIterator() {
        return posts.iterator();
    }

    public Iterator<Post> getRecentIterator() {
        posts.sort((p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        return posts.iterator();

    }
}
