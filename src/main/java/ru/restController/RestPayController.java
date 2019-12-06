package ru.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.entity.PayEntity;
import ru.service.PayService;

import java.util.List;



@RestController
@RequestMapping("/Pay")
public class RestPayController {
    @Autowired
    PayService payService;

  //  @GetMapping( produces = "application/json")
    @GetMapping( produces = "application/json")
    //@GetMapping( produces = APPLICATION_XML_VALUE))
    public List<PayEntity> payList() {
        System.out.println("покупки");
        return  payService.payList();
    }
}

