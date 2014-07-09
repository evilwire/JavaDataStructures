package com.DataStructures.simple;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: evilwire
 * Date: 7/8/14
 * Time: 8:56 AM
 * To change this template use File | Settings | File Templates.
 */
public class Tree<E> {
   private Node<E> root;

   public Tree() {
      this.root = null;
   }

   private Node<E> findNode( E target ){
      Node<E> targetNode = null;

      // do a breadth first search of the tree
      if(this.root == null)
         return null;

      Stack<Node<E>> nodeStack = new Stack<Node<E>>();
      nodeStack.push( this.root );
      while( !nodeStack.empty() ){
         Node<E> currentNode = nodeStack.pop();
         if( currentNode.getData() == target )
            return currentNode;

         for( Node<E> childNode : currentNode.getChildren())
            nodeStack.push( childNode );
      }

      return targetNode;
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

      public E getData(){
         return this.data;
      }

      public List<Node<E>> getChildren(){
         return this.children;
      }
   }
}

