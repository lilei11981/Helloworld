package com.lilei1998.datastructure;

/**
 * Created by lilei on 2017/11/9 上午10:15.
 */
public class MyLinkedList {
    Node head = null;   //  头节点

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode(5);
        myLinkedList.addNode(3);
        myLinkedList.addNode(1);
        myLinkedList.addNode(2);
        myLinkedList.addNode(55);
        myLinkedList.addNode(36);
        System.out.println("链表长度：" + myLinkedList.length());
        System.out.println("链表头结点数据：" + myLinkedList.head.data);
        myLinkedList.printList();
//        myLinkedList.deleteNode(4);
//        System.out.println("链表删除第 4 个元素后：");
//        myLinkedList.printList();
        System.out.println("========");
//        Node test = new Node(5);
        myLinkedList.deleteNode(new Node(5));
        myLinkedList.printList();
    }

    public void addNode(int data) {   //  向节点插入数据
        Node newNode = new Node(data);  //  实例化一个节点
        if (head == null) {   //  如果链表长度为0，则把数据赋值给头节点
            head = newNode;
            return;
        }
        Node temp = head;   // 把头结点赋值给temp
        while (temp.next != null) {    //  循环直到链表结尾
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public boolean deleteNode(int index) {  // 删除第 index 个节点
        if (index < 1 || index > length()) {
            return false;
        }
        if (index == 1) {  //  当 index = 1 时的情况
            head = head.next;
            return true;
        }
        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {     //  当 index >= 1 时的情况
            if (i == index) {
                preNode.next = curNode.next;
                return true;
            }
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return false;
    }


    public int length() {    //  返回链表的长度
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public boolean deleteNode(Node node) {  // 在不知道头指针的情况下删除指定节点
        if (node == null || node.next == null) {
            return false;
        }
        int temp = node.data;
        node.data = node.next.data;
        node.next.data = temp;
        node.next = node.next.next;
        System.out.println("删除成功！");
        return true;
    }

    public void printList() {    //  输出链表中的元素
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public Node ReverseIteratively(Node head) {  //  链表反转
        Node pReverseHead = head;     // 头节点赋值
        Node pNode = head;
        Node pPrev = null;
        while (pNode != null) {    //  循环
            Node pNext = pNode.next;
            if (pNext == null) {
                pReverseHead = pNode;
            }
            pNode.next = pPrev;
            pPrev = pNode;
            pNode = pNext;
        }
        this.head = pReverseHead;
        return this.head;
    }

    static class Node {
        Node next = null;   // 节点的引用，指向下一个节点
        int data;     // 节点的对象，即内容

        public Node(int data) {
            this.data = data;
        }
    }
}
