import without.inheritance.*;

public class WithoutMain {
    public static void main(String[] args){
        NormalMember member1 = new NormalMember(1, "naltoma");
        System.out.println(member1.computeAmmount(1000));

        StudentMember member2 = new StudentMember(2, "naltoma-stu");
        System.out.println(member2.computeAmmount(1000));

        SpecialMember member3 = new SpecialMember(3, "naltoma-special");
        System.out.println(member3.computeAmmount(1000));
    }
}
