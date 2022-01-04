import java.util.Stack;

public class Palindrom {
  public static class Node {
    public Node next;
    public char value;
  }

  public static boolean isPalindromeWithStringBuffer(String text) {
    return new StringBuffer(text).reverse().toString().equals(text);
  }

  public static boolean isPalindromeWithString(String text) {
    return isPalindromeWithString(text, 0, text.length() - 1);
  }

  public static boolean isPalindromWithLinkedList(Palindrom.Node node) {
    return isPalindromWithLinkedList(fillStack(new Stack<>(), node, node), null);
  }

  private static boolean isPalindromeWithString(
      final String text, final int forward, final int backward) {
    if (forward >= backward) {
      return true;
    }
    if (text.charAt(forward) != text.charAt(backward)) {
      return false;
    }
    return isPalindromeWithString(text, forward + 1, backward - 1);
  }

  private static boolean isPalindromWithLinkedList(Stack<Node> stack, Palindrom.Node node) {
    if (stack.isEmpty()) {
      return true;
    }
    if (node == null) {
      node = stack.get(0).next;
    }
    if (stack.pop().value != node.value) {
      return false;
    }
    return isPalindromWithLinkedList(stack, node.next);
  }

  private static Stack<Palindrom.Node> fillStack(
      Stack<Palindrom.Node> stack, Palindrom.Node node, Palindrom.Node runner) {
    if (node != null && runner != null && runner.next != null) {
      stack.push(node);
      fillStack(stack, node.next, runner.next.next);
    }
    return stack;
  }
}
