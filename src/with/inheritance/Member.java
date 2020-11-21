package with.inheritance;

public class Member {
    public int id;
    public String name;
    public double discountRate = 1.0; // 100%価格で提供

    public Member(int _id, String _name){
        this.id = _id;
        this.name = _name;
    }

    public int computeAmmount(int price){
        return (int)Math.round(price * this.discountRate);
    }
    
}