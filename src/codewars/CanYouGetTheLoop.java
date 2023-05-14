package codewars;

import org.w3c.dom.Node;
import java.util.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class CanYouGetTheLoop {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(3, 12);
    }

    public class LoopInspector {

        public int loopSize(Node node) {
            ArrayList<Node> loopArr = new ArrayList<Node>();
            while (!loopArr.contains(node)) {
                loopArr.add(node);
                //node = node.getNext();
            }
            int firstIndex = Math.max(0, loopArr.indexOf(node));
            return loopArr.size() - firstIndex;
        }

    }
}
