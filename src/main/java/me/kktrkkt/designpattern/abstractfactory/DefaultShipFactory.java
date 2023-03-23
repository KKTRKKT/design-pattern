package me.kktrkkt.designpattern.abstractfactory;

public abstract class DefaultShipFactory implements ShipFactory {

    private static void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    static void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    static void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }
}
