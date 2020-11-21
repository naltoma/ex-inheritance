package with.inheritance;

public class SpecialMember extends Member {
   
    public SpecialMember(int _id, String _name){
        super(_id, _name);
        this.discountRate = 0.9;
    }
}
