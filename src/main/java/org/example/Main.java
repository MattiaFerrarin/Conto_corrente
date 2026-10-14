package org.example;

import static java.lang.IO.println;

public class Main {
    static void main() {
        ContoBancario cb = new ContoBancario();
        try {
            cb.accredita(20.0);
            cb.preleva(100.0);
        } catch (SaldoInsufficienteException e) {
            println(e.getMessage());
        } finally {
            println("Finished first test");
        }


        cb = new ContoBancario();
        try {
            cb.accredita(20.0);
            cb.preleva(-100.0);
        } catch (SaldoInsufficienteException | ImportoNonValidoException e) {
            println(e.getMessage());
        } finally {
            println("Finished second test");
        }


        cb = new ContoBancario();
        try {
            cb.accredita(20.0);
            cb.preleva(10.0);
        } catch (SaldoInsufficienteException e) {
            println(e.getMessage());
        } finally {
            println("Finished third test");
        }
    }
}
