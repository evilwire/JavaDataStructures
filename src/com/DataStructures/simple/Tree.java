package com.DataStructures.simple;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: evilwire
 * Date: 7/8/14
 * Time: 8:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class Tree<E> {
   private E root;

   public Tree() {
   }

   public Tree<E> getSubtree( Node<E> rootNode ) {
      Tree<E> subTree = new Tree<E>();
      return subTree;
   }

   public class Node<E> {
      private E data;
      private Node<E> parent;
      private List<Node<E>> children;

      public Node( E data ) {
         this(null, data);
      }

      public Node( Node<E> parent, E data ) {
         this.parent = parent;
         this.data = data;
      }
   }
}

