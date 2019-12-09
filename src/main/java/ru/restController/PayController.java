package ru.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.entity.PayEntity;
import ru.service.PayService;

import java.util.List;

@Controller
@RequestMapping(value = "/pay")
public class PayController {

    @Autowired
    PayService payService;

    @GetMapping
    public ModelAndView paylist() {

        List<PayEntity> payEntity = payService.payList();
        payEntity.forEach(x->System.out.println(x.getPersonEntity().getName()));
        return new ModelAndView("PayList", "parcels", payEntity);
    }
}
