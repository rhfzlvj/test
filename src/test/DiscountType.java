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
            return 1;
        }
    };

    abstract long getDiscountAmt (DiscounterDto discounterDto, long originAmt);
}
