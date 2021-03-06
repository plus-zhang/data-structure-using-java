package tree;

import queue.Queue;

/**
 * @author guochengsen
 */
public interface Tree<E extends Comparable<E>> {

    VisibleNode root();

    void add(E e);

    void delete(E e);

    int size();

    boolean isEmpty();

    boolean contains(E e);

    void preorder(Queue<E> queue);

    void inorder(Queue<E> queue);

    void postorder(Queue<E> queue);

    void levelorder(Queue<E> queue);

    E max();

    E min();

    E floor(E e);

    E ceil(E e);

    int rank(E e);

    E select(int rank);
}
