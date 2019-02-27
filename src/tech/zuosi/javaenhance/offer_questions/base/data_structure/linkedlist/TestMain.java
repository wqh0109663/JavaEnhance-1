package tech.zuosi.javaenhance.offer_questions.base.data_structure.linkedlist;

import tech.zuosi.javaenhance.offer_questions.base.data_structure.linkedlist.delete_element_from_linkedlist.Solution;
import tech.zuosi.javaenhance.offer_questions.base.data_structure.linkedlist.print_linkedlist_from_tail.ReverseLinkedList;
import tech.zuosi.javaenhance.offer_questions.base.data_structure.linkedlist.print_linkedlist_from_tail.WithRecursiveInvoke;
import tech.zuosi.javaenhance.offer_questions.base.data_structure.linkedlist.print_linkedlist_from_tail.WithStack;

/**
 * Created by luckykoala on 19-2-27.
 */
public class TestMain {
    public static void main(String[] args) {
        //从尾到头打印
        //1 - 2 - 3 - 4 - 5
        Node first = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
        WithStack withStack = new WithStack();
        withStack.print(first);
        System.out.println();
        new WithRecursiveInvoke().print(first);
        System.out.println();
        new ReverseLinkedList().print(first); //会修改链表，最后测试
        System.out.println();

        //删除链表节点
        Node a = new Node(1, null);
        Node b = new Node(3, a);
        Node c = new Node(5, b);
        withStack.print(c);System.out.println();
        Solution solution = new Solution();
        solution.deleteNode(c, a);
        withStack.print(c);System.out.println();
        solution.deleteNode(c, b);
        withStack.print(c);System.out.println();
        solution.deleteNode(c, c);
        withStack.print(c);System.out.println();
        solution.deleteNode(c, null);
        withStack.print(c);System.out.println();
    }
}
