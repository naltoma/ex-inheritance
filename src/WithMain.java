import with.inheritance.*;

public class WithMain {
    public static void main(String[] args){
        Member member1 = new Member(1, "naltoma");
        member1.sayHello();
        member1.computeAmmount(1000);
        System.out.println(member1.getAmmount());
        member1.UseCoupon("A002");
        System.out.println(member1.getAmmount());

        System.out.println("------");
        StudentMember member2 = new StudentMember(2, "naltoma-stu");
        member2.sayHello();
        member2.computeAmmount(1000);
        System.out.println(member2.getAmmount());

        System.out.println("------");
        SpecialMember member3 = new SpecialMember(3, "naltoma-special");
        member3.sayHello();
        member3.computeAmmount(1000);
        System.out.println(member3.getAmmount());
    }
}
