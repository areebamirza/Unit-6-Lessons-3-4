class Main {
  public static void main(String[] args) {
    
    String[] words2 = {"apple", "banana", "peach", "cherries", "blueberries"};

    for(int i = 0; i < words2.length; i++)
    {
      String first = words2[i].substring(0, 1);
      String last = words2[i].substring(words2[i].length() - 1);
      System.out.println("Index Value " + i + ": " + words2[i] + " " + first + " " + last);
    }
    
  }
}