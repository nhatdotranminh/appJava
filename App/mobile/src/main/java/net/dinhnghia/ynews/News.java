package net.dinhnghia.ynews;

/**
 * Created by vodinhnghia on 12/27/17.
 */

public class News {
    private int Id;
    private int CategoryId;
    private int UserId;
    private  String Title;
    private  String Content;

    public News(int id, int categoryId, int userId, String title, String content) {
        Id = id;
        CategoryId = categoryId;
        UserId = userId;
        Title = title;
        Content = content;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }
}
