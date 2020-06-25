public class Main {
    public static void main(String[] args) {

    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int sucess = 0;
        try (RobotConnection rc = robotConnectionManager.getConnection()) {
            rc.moveRobotTo(toX, toY);
            sucess = 1;
        }
        catch (RobotConnectionException rce) {}
        catch (Exception e) { throw e; }

        if (sucess != 1) {
            try (RobotConnection rc = robotConnectionManager.getConnection()) {
                rc.moveRobotTo(toX, toY);
                sucess = 1;
            }
            catch (RobotConnectionException rce) {}
            catch (Exception e) { throw e; }
        }

        if (sucess != 1) {
            try (RobotConnection rc = robotConnectionManager.getConnection()) {
                rc.moveRobotTo(toX, toY);
                sucess = 1;
            }
            catch (RobotConnectionException rce) {
                if (sucess != 1) {
                    throw new RobotConnectionException(rce.getMessage(), rce);
                }
            }
            catch (Exception e) { throw e; }
        }
    }
}
