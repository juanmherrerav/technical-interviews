package cl.juan.playground.amazon.robot.route;

public class CircularRobot {

    public static final String NORTH = "north";
    public static final String SOUTH = "south";
    public static final String EAST = "east";
    public static final String WEST = "west";

    String check(String commands) {

        int initialX = 0;
        int initialY = 0;

        int x = 0;
        int y = 0;
        String direction = NORTH;
        for (int j = 0; j < 4; j++)
            for (int i = 0; i < commands.length(); i++) {
                if (direction.equals(NORTH)) {
                    if (commands.charAt(i) == 'G') {
                        y++;
                    } else if (commands.charAt(i) == 'L') {
                        direction = WEST;
                    } else if (commands.charAt(i) == 'R') {
                        direction = EAST;
                    }
                } else if (direction.equals(EAST)) {
                    if (commands.charAt(i) == 'G') {
                        x++;
                    } else if (commands.charAt(i) == 'L') {
                        direction = NORTH;
                    } else if (commands.charAt(i) == 'R') {
                        direction = SOUTH;
                    }
                } else if (direction.equals(SOUTH)) {
                    if (commands.charAt(i) == 'G') {
                        y--;
                    } else if (commands.charAt(i) == 'L') {
                        direction = EAST;
                    } else if (commands.charAt(i) == 'R') {
                        direction = WEST;
                    }
                } else if (direction.equals(WEST)) {
                    if (commands.charAt(i) == 'G') {
                        x--;
                    } else if (commands.charAt(i) == 'L') {
                        direction = SOUTH;
                    } else if (commands.charAt(i) == 'R') {
                        direction = NORTH;
                    }
                }
            }

        if (x == 0 && y == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

}
