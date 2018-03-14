package com.ws.RestAPI.resource;

import com.ws.RestAPI.Model.Employee;
import com.ws.RestAPI.Model.Message;
import com.ws.RestAPI.messageService.EmployeeDAO;
import com.ws.RestAPI.messageService.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;

@Path("/messages/comment")
public class MessageResource {

    MessageService messageService = new MessageService();
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Message> goGet(){
        return messageService.getMessages();
    }

    @Path("/{id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON) //MIME Multipurpose Internet Mail Extensions
    public Map<Long, Message> goGetq(@PathParam("id") int id){
        return messageService.getMessagesID(id);
    }
    @GET
    @Path("/text")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
        return "Hello Jersey Text";
    }

    // This method is called if XML is request
    @GET
    @Path("/xml")
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey XML" + "</hello>";
    }

    // This method is called if HTML is request
    @GET
    @Path("/html")
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        return "<html> \" + \"<title>\" + \"Hello Jersey HTML\" + \"</title>\"\n" +
                "                + \"<body><h1>\" + \"Hello Jersey HTML\" + \"</body></h1>\" + \"</html>";
    }
    @GET
    @Path("/employee")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Employee> getEmployees_JSON() {
        List<Employee> listOfCountries = EmployeeDAO.getAllEmployees();
        return listOfCountries;
    }
}