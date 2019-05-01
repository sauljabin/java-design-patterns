package pattern.structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * La flyweight factory decide si reutilizar las instancias existentes.
 */
public class TreeTypeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color);
            treeTypes.put(name, result);
        }
        return result;
    }
}
