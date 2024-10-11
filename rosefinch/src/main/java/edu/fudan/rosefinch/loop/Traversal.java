package edu.fudan.rosefinch.loop;

public class Traversal {
    
    // 递归函数，遍历链表，返回最后一个节点
    static Node recursive(Node x) {
        while (x.next != null) { // 伪代码中的 while (...) { x = x.f; }
            x = x.next;
        }
        return x; // 返回最后一个节点
    }

    public static void main(String[] args) {

        Node head = new Node("title1", "content1");
        head.next = new Node("title2", "content2");
        head.next.next = new Node("title3", "content3");
        head.next.next.next = new Node("title4", "content4");

        // 递归遍历链表并获取最后一个节点
        Node lastNode = recursive(head);

        // 输出最后一个节点的值
        System.out.println("Last node value: " + lastNode.content);
    }
}