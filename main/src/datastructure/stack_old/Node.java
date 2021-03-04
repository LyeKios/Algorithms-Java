package datastructure.stack_old;

/**
 * 节点(组成栈)
 * Created by ozc on 2018/3/27.
 *
 * @author ozc
 * @version 1.0
 */
public class Node {

    //数据域
    public int data;

    //指针域，指向下一个节点
    public Node next;

    public Node() {
    }

    public Node(int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

}
