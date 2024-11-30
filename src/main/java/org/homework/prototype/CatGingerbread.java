package org.homework.prototype;

public class CatGingerbread extends Pastry {
    public CatGingerbread(String sponge, String filling, String decoration) {
        super(sponge, filling, decoration);
    }

    public CatGingerbread(CatGingerbread catGingerbread) {
        super(catGingerbread);
    }


    @Override
    public Pastry clone() {
        return new CatGingerbread(this);
    }
}
