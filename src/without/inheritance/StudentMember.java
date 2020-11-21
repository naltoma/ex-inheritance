package without.inheritance;

public class StudentMember {
    public int id;
    public String name;
    public double discountRate = 0.7; // 70%価格で提供

    public StudentMember(int _id, String _name){
        this.id = _id;
        this.name = _name;
    }

    public int computeAmmount(int price){
        return (int)Math.round(price * this.discountRate);
    }
    
}
