package ru.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.service.PayService;

@Controller
@RequestMapping(value = "/pay")
public class PayController {

    @Autowired
    PayService payService;

    @GetMapping
    public ModelAndView paylist() {

        return new ModelAndView("PayList", "parcels", payService.payList());
    }
}
