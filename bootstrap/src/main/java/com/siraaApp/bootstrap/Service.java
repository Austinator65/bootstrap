package com.siraaApp.bootstrap;

import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service {
    private final String url = "https://jsonplaceholder.typicode.com/posts/1";
    // private final String url2 = "https://jsonplaceholder.typicode.com/posts";
    RestTemplate restTemplate = new RestTemplate();
    Post post = restTemplate.getForObject(url, Post.class);

    int showUserId() {
        return post.getUserId();
    }

    String showTitle() {
        return post.getTitle();
    }

    

}