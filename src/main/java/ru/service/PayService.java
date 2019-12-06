package ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.entity.PayEntity;
import ru.repository.PayRepository;

import java.util.List;

@Service
public class PayService {
    @Autowired
    PayRepository payRepository;

    public List<PayEntity> payList() { return payRepository.findAll();    }
    public void addPay(PayEntity payEntity) { payRepository.saveAndFlush(payEntity);    }
}
