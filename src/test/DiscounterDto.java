package test;

public class DiscounterDto implements Discountable {

    private String dtype;
    private String code;
    private String name;
    private int rate;
    private long amt;
    private DiscountType discountType;

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public long getAmt() {
        return amt;
    }

    public void setAmt(long amt) {
        this.amt = amt;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public long getDiscountAmt(long originAmt) {
        System.out.println("test branch 1");
        System.out.println("test branch 2");
/*
        if ("RATE".equals(dtype)) {
            return originAmt * rate / 100;
        } else if ("AMT".equals(dtype)) {
            if (originAmt < amt) {
                return originAmt;
            } else {
                return 0;
            }
        }
*/
        return discountType.getDiscountAmt(this, originAmt);
    }
}
