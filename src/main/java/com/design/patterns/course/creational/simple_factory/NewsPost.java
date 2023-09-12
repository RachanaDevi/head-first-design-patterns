package com.design.patterns.course.creational.simple_factory;

import java.time.LocalDate;

public class NewsPost extends Post{

    private String headline;

    private LocalDate newsTime;

    public String headline() {
        return headline;
    }

    public void headline(String headline) {
        this.headline = headline;
    }

    public LocalDate newsTime() {
        return newsTime;
    }

    public void newsTime(LocalDate newsTime) {
        this.newsTime = newsTime;
    }
}
