package day026.se06.ThreanTest;

import day17.se02.Demo01Exception.Person;

public class MainTest {
    public static void main(String[] args) {
        Account ac = new Account(10000);


            PersonA personA = new PersonA(ac);
            PersonB personB = new PersonB(ac);

            personA.start();
            personB.start();

    }
}