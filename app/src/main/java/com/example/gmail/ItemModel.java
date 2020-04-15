package com.example.gmail;

public class ItemModel {
    String name;
    String description;
    String content;
    String time;
    int avatarResource;

    public ItemModel(String name, String description, String content, String time, int avatarResource) {
        this.name = name;
        this.description = description;
        this.content = content;
        this.time = time;
        this.avatarResource = avatarResource;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public int getAvatarResource() {
        return avatarResource;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvatarResource(int avatarResource) {
        this.avatarResource = avatarResource;
    }
}
