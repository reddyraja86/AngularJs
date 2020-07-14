package com.relay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.util.HtmlUtils;

import com.relay.RelayHelperAppApplication.PubsubOutboundGateway;

@RestController
public class GreetingController {

	@Autowired
	private SimpMessagingTemplate webSocket;

  @MessageMapping("/hello")
  @SendTo("/topic/greetings")
  public Greeting greeting(HelloMessage message) throws Exception {
    Thread.sleep(1000); // simulated delay
    return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
  }
  
  
  @RequestMapping(value = "/replyme/{id}", method = RequestMethod.GET)
  @ResponseBody
  public void poll(@PathVariable final String id) throws Exception {
	  System.out.println("poll-----------------");
	  HelloMessage h= new HelloMessage(id);
	  webSocket.convertAndSend("/topic/greetings", "  {\"content\":\""+id+"\"}");
  }
  
  
  // tag::autowireGateway[]
  @Autowired
  private PubsubOutboundGateway messagingGateway;
  // end::autowireGateway[]

  @PostMapping("/publishMessage")
  public RedirectView publishMessage(@RequestParam("message") String message) {
	messagingGateway.sendToPubsub(message);
	return new RedirectView("/");
  }

}