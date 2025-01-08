package com.apikey.integrate.service;

import com.apikey.integrate.response.NewsResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {

    RestTemplate restTemplate = new RestTemplate();

    public Object getNews(String apikey) {
        String url = "https://newsapi.org/v2/top-headlines?country=us&apiKey="+apikey;
        Object response = restTemplate.getForObject(url, Object.class);
        return response;
    }

    public NewsResponse getTotalResult(String apikey) {
        String url = "https://newsapi.org/v2/top-headlines?country=us&apiKey="+apikey;
        NewsResponse newsResponse = restTemplate.getForObject(url, NewsResponse.class);
        return newsResponse;
    }

    public NewsResponse getArticles(String apikey) {
        String url = "https://newsapi.org/v2/top-headlines?country=us&apiKey="+apikey;
        NewsResponse newsResponse = restTemplate.getForObject(url, NewsResponse.class);
        return newsResponse;
    }
}
