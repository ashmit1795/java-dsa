import java.util.*;

class program1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        HashSet<Integer> set = new HashSet<>();
        // TreeSet<Arrays> set = new TreeSet<>();
        set.add(77);
        set.add(77);
        set.add(77);
        set.add(77);
        set.add(77);
        set.remove(7613); // will not give any error
        System.out.println(set.size()); // 1 -> Unique Elements
        System.out.println(set.contains(77)); // true
        System.out.println(set.contains(71)); // false
        set.add(71);
        set.add(56);
        set.add(891);
        set.add(756);
        set.add(78798);
        set.add(7613);
        System.out.println(set.contains(71)); // true
        System.out.println(set.size()); // 7 -> Unique Elements
        System.out.println(set); // [756, 71, 56, 891, 77, 7613, 78798] - HashSet, [56, 71, 77, 756, 891, 7613, 78798] - TreeSet
        set.remove(7613);
        System.out.println(set); // [756, 71, 56, 891, 77, 78798] - HashSet, [56, 71, 77, 756, 891, 78798] - TreeSet
        System.out.println(set.size()); // 6 -> Unique Elements

        
    }
}
