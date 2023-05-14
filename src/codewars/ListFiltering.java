package codewars;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        List<Object> nList = new ArrayList<>();
        for (Object Nlist : list) {
            if (Nlist instanceof Integer) {
                nList.add(Nlist);
            }
        }
        return nList;
    }

    public static void main(String[] args) {
        ListFiltering.filterList(List.of(1, 2, "a", "b"));
    }
}
