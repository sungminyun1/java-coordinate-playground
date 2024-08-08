package coord;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Optional;

public class ShapeFactory {

    private ShapeFactory() {}

    public static Shape getShape(Points points){

        SupportShapes shape = Arrays.stream(SupportShapes.values())
                .filter(type -> invokeSupport(type.getShapeClass(), points))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Shape not found"));

        try {
            return  shape.getShapeClass().getConstructor().newInstance(points);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean invokeSupport(Class<?> clazz, Points points){
        try {
            return (boolean)clazz.getMethod("support").invoke(points);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
