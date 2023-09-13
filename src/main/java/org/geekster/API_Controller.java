package org.geekster;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API_Controller {

    @GetMapping("name")
    public String getName()
    {

       String value = "Vaibhav";
        MailHandlerBase.sendMail(value);
        return value;
    }
}
