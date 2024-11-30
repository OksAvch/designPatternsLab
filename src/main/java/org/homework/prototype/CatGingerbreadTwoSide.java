package org.homework.prototype;

public class CatGingerbreadTwoSide extends Pastry {
    protected String backSponge;
    protected String backDecoration;

    public CatGingerbreadTwoSide(String frontSponge, String filling, String backSponge, String frontDecoration, String backDecoration) {
        super(frontSponge, filling, frontDecoration);
        this.backSponge = backSponge;
        this.backDecoration = backDecoration;
    }

    public CatGingerbreadTwoSide(CatGingerbreadTwoSide source) {
        super(source);
        this.backSponge = source.backSponge;
        this.backDecoration = source.backDecoration;
    }

    @Override
    public Pastry clone() {
        return new CatGingerbreadTwoSide(this);
    }
}
