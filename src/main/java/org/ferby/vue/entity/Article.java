package org.ferby.vue.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name="article")
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "htmlContent")
    private String htmlContent;
    @Column(name = "mdContent")
    private String mdContent;
    @Column(name = "describe")
    private String describe;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "thumbsUpCount")
    private int thumbsUpCount;
    @Column(name = "commentCount")
    private int commentCount;
    @Column(name = "collectionCount")
    private int collectionCount;
    @Column(name = "viewCount")
    private int viewCount;
    @Column(name = "reward")
    private int reward;
    @Column(name = "date")
    private Date date;
    @Column(name = "pushPerson")
    private String pushPerson;
    @ManyToMany()
    private List<Category> categoryList;
    @ManyToMany()
    private List<Tag> tagList;
    @Column(name = "isPrivate")
    private int isPrivate;
    @Column(name = "password")
    private String password;
    @Column(name = "share")
    private int share;
    @Column(name = "isArticles")
    private int isArticles;
    @ManyToOne(fetch = FetchType.LAZY)
    private Articles articles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHtmlContent() {
        return htmlContent;
    }

    public void setHtmlContent(String htmlContent) {
        this.htmlContent = htmlContent;
    }

    public String getMdContent() {
        return mdContent;
    }

    public void setMdContent(String mdContent) {
        this.mdContent = mdContent;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getThumbsUpCount() {
        return thumbsUpCount;
    }

    public void setThumbsUpCount(int thumbsUpCount) {
        this.thumbsUpCount = thumbsUpCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getCollectionCount() {
        return collectionCount;
    }

    public void setCollectionCount(int collectionCount) {
        this.collectionCount = collectionCount;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPushPerson() {
        return pushPerson;
    }

    public void setPushPerson(String pushPerson) {
        this.pushPerson = pushPerson;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    public int getIsPrivate() {
        return isPrivate;
    }

    public void setIsPrivate(int isPrivate) {
        this.isPrivate = isPrivate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    public int getIsArticles() {
        return isArticles;
    }

    public void setIsArticles(int isArticles) {
        this.isArticles = isArticles;
    }

    public Articles getArticles() {
        return articles;
    }

    public void setArticles(Articles articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", htmlContent='" + htmlContent + '\'' +
                ", mdContent='" + mdContent + '\'' +
                ", describe='" + describe + '\'' +
                ", uuid='" + uuid + '\'' +
                ", thumbsUpCount=" + thumbsUpCount +
                ", commentCount=" + commentCount +
                ", collectionCount=" + collectionCount +
                ", viewCount=" + viewCount +
                ", reward=" + reward +
                ", date=" + date +
                ", pushPerson='" + pushPerson + '\'' +
                ", categoryList=" + categoryList +
                ", tagList=" + tagList +
                ", isPrivate=" + isPrivate +
                ", password='" + password + '\'' +
                ", share=" + share +
                ", isArticles=" + isArticles +
                ", articles=" + articles +
                '}';
    }
}
