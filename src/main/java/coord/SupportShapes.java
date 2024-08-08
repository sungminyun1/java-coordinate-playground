package coord;

public enum SupportShapes {
    LINE(Line.class),
    SQUARE(Square.class);

    private final Class<? extends Shape> shapeClass;

    SupportShapes(Class<? extends Shape> clazz) {
        this.shapeClass = clazz;
    }

    public Class<? extends Shape> getShapeClass() {
        return shapeClass;
    }
}
