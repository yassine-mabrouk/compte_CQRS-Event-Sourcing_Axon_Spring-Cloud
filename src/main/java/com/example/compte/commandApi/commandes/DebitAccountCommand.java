package com.example.compte.commandApi.commandes;

import lombok.Getter;

public class DebitAccountCommand extends BaseCommand<String>{
 @Getter
 private double amount;
 @Getter
 private  String currency;

    public DebitAccountCommand(String id, double amount, String currency) {
        super(id);
        this.amount = amount;
        this.currency = currency;
    }
}
