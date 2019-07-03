package com.kriehl.contract.controllers;

import com.kriehl.contract.dto.Contract;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(ContractController.CONTRACT_BASE_URI)
public class ContractController {

    public static final String CONTRACT_BASE_URI = "src/v1/contracts";

    @RequestMapping(value = "{contractNumber}")
    public Contract getContract(@PathVariable final int contractNumber) {
        Contract contract = new Contract();
        contract.setName("Sascha");
        contract.setId(contractNumber);
        contract.setTest(contract.getName() + " ist " + contract.getId() + " Jahre alt.");
        return contract;
    }
}
