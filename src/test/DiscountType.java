package test;

public enum DiscountType {

    RATE {
        @Override
        long getDiscountAmt(DiscounterDto discounterDto, long originAmt) {
            return 0;
        }
    },
    AMT {
        @Override
        long getDiscountAmt(DiscounterDto discounterDto, long originAmt) {
            return 0;
        }
    };

    abstract long getDiscountAmt (DiscounterDto discounterDto, long originAmt);
}
