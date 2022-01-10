class Main {
  public static void main(String[] args) {
    
    String[] words2 = {"apple", "banana", "peach", "cherry", "blueberry"};

    //for-each

    for(String fruit : words2)
    {
      System.out.println(fruit);
    }

    System.out.println();

    //for-eac - only prints fruits with length 5

    for(String fruit : words2)
    {
      if(fruit.length() == 5)
      {
        System.out.println(fruit);
      }
    }

    System.out.println();
    
    for(int i = 0; i < words2.length; i++)
    {
      String first = words2[i].substring(0, 1);
      String last = words2[i].substring(words2[i].length() - 1);
      System.out.println("Index Value " + i + ": " + words2[i] + " " + first + " " + last);
    }

    System.out.println();

    int[] nums = {12, 65, 80, 70, 34, 22};

    int sum = 0;

    for(int x : nums)
    {
      sum += x;
    }

    System.out.print("The average of nums is ");
    System.out.printf("%.2f%n", ((double) sum/nums.length));

    System.out.println();
    System.out.println();
    
    for(int i = nums.length - 1; i > 3; i--)
    {
      nums[i] = nums[i - 1];
    }

    nums[3] = 99;

    for(int i = 0; i < nums.length; i++)
    {
      System.out.print(nums[i] + " ");
    }

    for(int i = 2; i < nums.length - 1; i++)
    {
      nums[i] = nums[i + 1];
    }

    System.out.println();

    for(int i = 0; i < nums.length; i++)
    {
      System.out.print(nums[i] + " ");
    }

    System.out.println();
    System.out.println();

    int[] nums2 = {1, 2, 3, 4};

    //shift to the left

    int temp = nums2[0];

    for(int i = 0; i < nums2.length - 1; i++)
    {
      nums2[i] = nums2[i + 1];
    }

    nums2[nums2.length - 1] = temp;

    for(int i = 0; i < nums2.length; i++)
    {
      System.out.print(nums2[i] + " ");
    }

    System.out.println();

    //shifts to the right
    
    int temp2 = nums2[nums2.length - 1];

    for(int i = nums2.length - 1; i > 0; i--)
    {
      nums2[i] = nums2[i - 1];
    }

    nums2[0] = temp;

    for(int i = 0; i < nums2.length; i++)
    {
      System.out.print(nums2[i] + " ");
    }

    System.out.println();
    
    //reversing the elements - using swap inside of for loop

    for(int i = 0; i < nums2.length / 2; i++)
    {
      int j = nums2.length - 1 - i;
      int temp3 = nums2[i];
      nums2[i] = nums2[j];
      nums2[j] = temp3;
    }

    for(int i = 0; i < nums2.length; i++)
    {
      System.out.print(nums2[i] + " ");
    }

  }
}