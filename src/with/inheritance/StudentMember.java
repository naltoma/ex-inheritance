package with.inheritance;

public class StudentMember extends Member {
   
    public StudentMember(int _id, String _name){
        super(_id, _name);
        setDiscountRate(0.7);
    }
}
