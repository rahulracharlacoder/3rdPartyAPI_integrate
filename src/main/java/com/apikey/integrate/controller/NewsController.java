package com.apikey.integrate.controller;

import com.apikey.integrate.response.NewsResponse;
import com.apikey.integrate.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping("/getNews")
    public Object getNews(@RequestParam String apikey) {
        return newsService.getNews(apikey);
    }

    @GetMapping("/getResults")
    public NewsResponse getResult(@RequestParam String apiKey) {
        return newsService.getTotalResult(apiKey);
    }

    @GetMapping("/getArticles")
    public NewsResponse getArticles(@RequestParam String apikey) {
        return newsService.getArticles(apikey);
    }
}
