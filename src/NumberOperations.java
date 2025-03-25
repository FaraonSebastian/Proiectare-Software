import java.util.*;
public class NumberOperations {

    private List<Integer> x;
    private List<Integer> y;
    public Random rand;

    public NumberOperations() {
        x = new ArrayList<>();
        y = new ArrayList<>();
        rand = new Random();
    }

    public void generateNumbers() {
        for (int i = 0; i < 5; i++) {
            x.add(rand.nextInt(11));
        }
        for (int i = 0; i < 8; i++) {
            y.add(rand.nextInt(11));
        }
        Collections.sort(x);
        Collections.sort(y);
    }

    public List<Integer> getXPlusY() {
        List<Integer> xPlusY = new ArrayList<>(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        return xPlusY;
    }

    public Set<Integer> getZSet() {
        Set<Integer> zSet = new TreeSet<>(x);
        zSet.retainAll(y);
        return zSet;
    }

    public List<Integer> getXMinusY() {
        List<Integer> xMinusY = new ArrayList<>(x);
        xMinusY.removeAll(y);
        return xMinusY;
    }

    public List<Integer> getXPlusYLimitedByP(int p) {
        List<Integer> xPlusY = getXPlusY();
        List<Integer> xPlusYLimitedByP = new ArrayList<>();
        for (int num : xPlusY) {
            if (num <= p) {
                xPlusYLimitedByP.add(num);
            } else {
                break;
            }
        }
        return xPlusYLimitedByP;
    }

    public void printResults() {
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("xPlusY: " + getXPlusY());
        System.out.println("zSet: " + getZSet());
        System.out.println("xMinusY: " + getXMinusY());
        System.out.println("xPlusYLimitedByP: " + getXPlusYLimitedByP(4));
    }

}
