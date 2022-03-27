So there are 3 types of arrays if im not mistaken right?

arrays (just numbers)
arraylist (a list that holds strings)
MultidimensionalArrays (Rows / Collumns)


arraylist can hold both strings and integers


 int[][] array =  new int[][]{(1,2,3), (5,7,8)}

 can be accessed globally written with static fields in front
 static int[][] array =  new int[][]{(1,2,3), (5,7,8)}

 the reason why we use -1 is because
 for(String s ; words){
      for(int i = words[s].length()-1; i >=0; i--){
        System.out.print(words.substring(i,i+1));
      }
      System.out.println();
    }
    So for a string like a word "Hello", it's five letters long. But for strings, arrays, or ArrayLists, the position starts at zero. So the H in Hello is at position 0. So if you tried to find position 5, which is the length of the string, it won't exist because it counts up from zero. 

In the Code it's starting from the end and going backward, so you want to start at length-1 because of the 0 index.


 Example:
This would be some 2d Arraylist filled with integers: ArrayList<ArrayList<Integer>> myList = new ArrayList<ArrayList<Integer>>();
Then you could traverse through it using: 
for (int i= 0; i<myList.size(); i++)

{
    System.out.print(myList.get(i));

    for (int j= 0; j< myList.get(i).size(); j++)

    {

        System.out.print(myList.get(j));

    }

}

That's just how I chose to print whatever is held in myList at i. The get function will take a location in the ArrayList and return whatever is help in the arraylist at that position. And the System.out.print will display it. There are different ways to do both of those things, so you may be familiar with something else.




