package com.bonree.javalearning.java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * java 11 httpclient 标准化
 */
public class HttpClientTest {

    public static void getConnection() throws IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("https://www.javastack.cn"))
//                .uri(URI.create("https://www.baidu.com/"))
                .GET()
                .build();
        HttpClient client = HttpClient.newHttpClient();

        // 同步
        HttpResponse<String> response = client.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println("-------------------------------");

        // 异步
        client.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        getConnection();
    }
}
