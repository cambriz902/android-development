package com.bloc.breezy.blocly.api;

import com.bloc.breezy.blocly.api.model.RssFeed;
import com.bloc.breezy.blocly.api.model.RssItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cambriz on 11/22/15.
 */
public class DataSource {
    private List<RssFeed> feeds;
    private List<RssItem> items;

    public DataSource() {
        feeds = new ArrayList<RssFeed>();
        items = new ArrayList<RssItem>();
        createFakeData();
    }

    public List<RssFeed> getFeeds() {
        return feeds;
    }

    public List<RssItem> getItems() {
        return items;
    }

    void createFakeData() {
        feeds.add(new RssFeed("My Favorite Feed",
                "This feed is just incredible, I can't even begin to tell you…",
                "http://favoritefeed.net", "http://feeds.feedburner.com/favorite_feed?format=xml"));
        for (int i = 0; i < 10; i++) {
            items.add(new RssItem(String.valueOf(i),
                    "An incredible news story #" + i,
                    "You won't believe how exciting this news story is, get ready to be blown away by its amazingness.",
                    "http://favoritefeed.net?story_id=an-incredible-news-story",
                    "http://rs1img.memecdn.com/silly-dog_o_511213.jpg",
                    0, System.currentTimeMillis(), false, false));
        }
    }
}
