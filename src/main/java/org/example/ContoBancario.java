package org.example;

public class ContoBancario {
    private double saldo;

    public double getSaldo(){
        return saldo;
    }

    public void accredita(double amount){
        saldo += amount;
    }

    public void preleva(double amount) throws SaldoInsufficienteException {
        if(amount < 0){
            throw new ImportoNonValidoException("Invalid import");
        }
        if(saldo - amount < 0){
            throw new SaldoInsufficienteException("Insufficient salds, missing "+(amount-saldo));
        }
        saldo -= amount;
    }
}
