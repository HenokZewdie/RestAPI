package com.ws.RestAPI.Model;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Message {
    private long id;
    private String message;
    private String author;
    private Date date;

    public Message(long id, String message, String author) {
        this.id = id;
        this.message = message;
        this.author = author;
        this.date = new Date();
    }

    public Message() {
    }
    public Message(long idi) {
        this.id = idi;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
