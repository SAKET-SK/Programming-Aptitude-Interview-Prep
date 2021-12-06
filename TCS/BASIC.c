// Program to print all value of
// command line argument
// once we get the value from command
// line we can use them to solve our problem.
#include<stdio.h>  // this is used to print the result using printf
#include<stdlib.h>  // this is used for function atoi() for converting string into int

// argc tells the number of arguments
// char *argv[] is used to store the command line 
//arguments in the pointer to char array i.e string format
int main(int argc, char *argv[])
{
  // means only one argument   exist that is file.exe
  if (argc == 1) {
     printf("No command line argument exist Please provide them first \n");
    return 0;
    } 

  else {
    int i;
    // actual arguments starts from index 1 to (argc-1)
    for (i = 1; i < argc; i++) {
      int value = atoi(argv[i]);
      // print value using stdio.h library's printf() function
      printf("%d\n", value);
    }
  return 0;
  }
}
