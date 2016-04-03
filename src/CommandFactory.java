public class CommandFactory {
    public static Command create(String representation) {
        if (isLeftRotation(representation)) {
            return new LeftRotation();
        } else if (isRightRotation(representation)) {
            return new RightRotation();
        } else {
            return new Displacement(getLength(representation));
        }
    }

    private static int getLength(String representation) {
        final int LENGTH = 1;
        if (isForwardDisplacement(representation)) {
            return LENGTH;
        }
        return -LENGTH;
    }

    private static boolean isLeftRotation(String representation) {
        return representation.equals("l");
    }

    private static boolean isRightRotation(String representation) {
        return representation.equals("r");
    }

    private static boolean isForwardDisplacement(String representation) {
        return representation.equals("f");
    }
}
