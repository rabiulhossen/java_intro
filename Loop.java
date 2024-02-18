-e/*

syntax of for loop:
for(initialization; condition; increment/decrement){
statement(s)
}
*/

class Loop {
  public static void main(String[] args) {
    for(int i = 0; i < 5; i++){
      System.out.println(i);
    }

    int array[] = {1,2,3,4,5};
    for(int i =0; i <array.length; i++){
      System.out.println(array[i]);
    }


    int index = 10;
    while(index> 1)
      {
        System.out.println(index);
        index++;
      }
  }
}


// do-while loop is different from while loop.firstly statement(s) is excuted then condition

/*
syntax of do-while loop--
do
{
statement(s);
}
while(condition);
*/

