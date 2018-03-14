package com.ws.RestAPI.resource;

import com.ws.RestAPI.Model.Message;
import com.ws.RestAPI.messageService.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/test")
public class NewMessage {

    MessageService messageService = new MessageService();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> goGet(){
        return messageService.getMessages();
    }
}