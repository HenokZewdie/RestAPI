
package com.ws.RestAPI.messageService;


import com.ws.RestAPI.Model.Message;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/** Example resource class hosted at the URI path "/myresource"
 */
@Path("/index")
public class MyResource {
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Message> getIt() {
        MessageService ms = new MessageService();
        return ms.getMessages();
    }
}