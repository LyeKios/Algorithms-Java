package datastructure.stack_old;

/**
 * 栈的数据模型
 * Created by ozc on 2018/3/28.
 *
 * @author ozc
 * @version 1.0
 */
public class Stack {

    public Node stackTop;
    public Node stackBottom;

    public Stack(Node stackTop, Node stackBottom) {
        this.stackTop = stackTop;
        this.stackBottom = stackBottom;
    }

    public Stack() {
    }


}
