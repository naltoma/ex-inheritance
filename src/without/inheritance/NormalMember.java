package without.inheritance;

public class NormalMember {
    private int id;
    private String name;
    private double discountRate = 1.0; // 100%価格で提供
    private int ammount;

    public NormalMember(int _id, String _name){
        this.id = _id;
        this.name = _name;
    }

    /**
     * 割引割合に応じた価格を算出する。
     * @param price 割り引く前の価格
     */
    public void computeAmmount(int price){
        this.ammount = (int)Math.round(price * this.discountRate);
    }

    /**
     * クーポンコード適用価格を算出する。
     * @param code クーポンコード
     */
    public void UseCoupon(String code){
        int afterAmmount;
        switch(code){
            case "A001":
                afterAmmount = ammount - 100;
                break;
            case "A002":
                afterAmmount = ammount - 1500;
                break;
            default:
                afterAmmount = ammount;
                break;
        }
        this.ammount = afterAmmount;
    }
    
    public int getAmmount(){
        return this.ammount;
    }
}
