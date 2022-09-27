import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.HashSet;


public class ListSetQueueMap {
    static List<String> sortList(List<String> list) {
        Collections.sort(list, Comparator.comparing(s -> s.toLowerCase()));
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("_______LIST_______");
        System.out.println("-----Add elements to the list");
        list.add("elephant");
        list.add("Zebra");
        list.add("cat");
        list.add("dog");
        list.add("monkey");
        list.add("puppy");
        list.add(3, "Lion");
        list.set(2, "spider");
        System.out.println("-----Size of the list: " + list.size());
        list.remove(4);
        System.out.println("-----Size of the list after removing: " + list.size());
        System.out.println("-----All animals in the zoo: ");
        System.out.println(list);
        System.out.println("-----The king of animals - " + list.get(3));
        System.out.println("-----Sort");
        System.out.println(sortList(list) + "\n");
        System.out.println("_______SET_______");
        Set<String> set = new HashSet<>();
        System.out.println("-----Add elements to the list");
        set.add("cat");
        set.add("lion");
        set.add("crocodile");
        set.add("rabbit");
        set.add("lion");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("Size of the list: " + set.size());
        System.out.println("-----Contains elements \"rabbit\": " + set.contains("rabbit") + "\n");
        System.out.println("_______QUEUE_______");
        Queue<String> queue = new ArrayDeque<>();
        queue.offer("Crocodile");
        queue.offer("Elephant");
        queue.offer("lion");
        queue.offer("Zebra");
        queue.offer("Monkey");
        System.out.println("All animals in the zoo: " + queue + "\n");
        for (String s : queue) {
            queue.peek();
            System.out.println(s + " - is next in the queue");
            queue.poll();
            System.out.println(s + " has already eaten ");
            System.out.println("Haven't eaten yet: " + queue + "\n");
        }
        System.out.println("_______MAP_______");
        Map<String, String> map = new TreeMap<>();
        map.put("24.08", "Independence Day of Ukraine");
        map.put("14.02", "Valentine's Day");
        map.put("31.12", "NEW year");
        map.put("07.01", "Christmas");
        System.out.println("-----Get value by key");
        System.out.println(map.get("31.12"));
        System.out.println("-----Get all keys");
        System.out.println(map.keySet());
        System.out.println("-----Get all values");
        System.out.println(map.values());
        System.out.println("-----Size of the list - " + map.size());
        System.out.println("-----Contains key \"14.02\": " + map.containsKey("14.02"));
        System.out.println("-----Contains values \"Independence Day of Ukraine\": "
                + map.containsValue("Independence Day of Ukraine"));
        System.out.println("-----Clear");
        map.clear();
    }
}
