/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        HashMap<Node, Node> nodeMap = new HashMap<>();
        Node current = head;

        // Create one cloned node for every original node.
        // The map stores each original node with its corresponding clone
        // so that the next and random pointers can be connected later.
        while (current != null) {
            nodeMap.put(current, new Node(current.val));
            current = current.next;
        }

        current = head;

        // Connect the next and random pointers of every cloned node.
        // Each original pointer is replaced with the corresponding
        // cloned node using the mapping created above.
        while (current != null) {
            nodeMap.get(current).next = nodeMap.get(current.next);
            nodeMap.get(current).random = nodeMap.get(current.random);

            current = current.next;
        }

        // The clone corresponding to the original head becomes
        // the head of the copied linked list.
        return nodeMap.get(head);
    }
}

class Main {
    // Function creates a linked list and assigns its random pointers.
    static Node createList(int[] values, int[] randomIndex) {
        if (values.length == 0) {
            return null;
        }

        Node[] nodes = new Node[values.length];

        // Create all nodes first so every random-pointer target
        // is available before the links are assigned.
        for (int index = 0; index < values.length; index++) {
            nodes[index] = new Node(values[index]);
        }

        // Connect consecutive nodes to form the normal linked-list chain.
        for (int index = 0; index + 1 < nodes.length; index++) {
            nodes[index].next = nodes[index + 1];
        }

        // Assign each random pointer using the given target index.
        // A value of -1 means the random pointer remains null.
        for (int index = 0; index < nodes.length; index++) {
            if (randomIndex[index] != -1) {
                nodes[index].random = nodes[randomIndex[index]];
            }
        }

        return nodes[0];
    }

    // Function prints each node's data along with its random-pointer index.
    static void printList(Node head) {
        HashMap<Node, Integer> indexMap = new HashMap<>();
        Node current = head;
        int index = 0;

        // Store the position of every node so a random pointer
        // can be displayed using its corresponding index.
        while (current != null) {
            indexMap.put(current, index++);
            current = current.next;
        }

        current = head;

        // Print each node in the format [data, randomIndex].
        while (current != null) {
            int randomIdx = current.random == null
                    ? -1
                    : indexMap.get(current.random);

            System.out.print("[" + current.val + "," + randomIdx + "]");

            if (current.next != null) {
                System.out.print(" ");
            }

            current = current.next;
        }
    }}