public class Math_Logic {

    public static int getAttackRoll(int movement, int enemyMovement, int gunSkill, int terrain, int range, int other) {
        return movement + enemyMovement + gunSkill + terrain + range + other;
    }
}
