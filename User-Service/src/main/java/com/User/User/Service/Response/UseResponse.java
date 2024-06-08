package com.User.User.Service.Response;


import com.User.User.Service.entity.User;

public class UseResponse {
    private  long userID;
    private String userName;
    private String userImage;
    private boolean active;
    private PostResponse postResponse;


    public UseResponse(User user) {
        this.userID = user.getUserID();
        this.userName = user.getUserName();
        this.userImage = user.getUserImage();
        this.active = user.isActive();
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public PostResponse getPostResponse() {
        return postResponse;
    }

    public void setPostResponse(PostResponse postResponse) {
        this.postResponse = postResponse;
    }
}
