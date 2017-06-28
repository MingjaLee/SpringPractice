package com.smart.aspectj.anno;

/**
 * @author jerry
 * @create 17/6/28 12:37
 */
public class ForumService {
    @NeedTest(value = true)
    public void deleteForum(int forumId) {
        System.out.println("删除论坛版块: " + forumId);
    }

    @NeedTest(value = false)
    public void deleteTopic(int postId) {
        System.out.println("删除论坛主题: " + postId);
    }
}
