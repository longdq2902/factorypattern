package com.example.factorypattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactorypatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactorypatternApplication.class, args);
		Bank bank = BankFactory.getBank(BankType.TPBANK);
        System.out.println(bank.getBankName());
    }

}
