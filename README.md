# Lab-A13
This repository contains three programs: CheckingAccount, Average, and StopWords

CheckingAccount:
Modify the CheckingAccount class example from Lesson A5, Designing and Using Classes, to throw an IllegalArgumentException in any of the following circumstances:
when the account is constructed with a negative balance - The message to be printed is "Negative balance in account 100".
when a negative amount is deposited - The message to be printed is "Negative amount deposited in account 100".
when the account is overdrawn (when the amount withdrawn exceeds the current balance) - The message to be printed is "Account 100 overdrawn"

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Average:
Students will be provided with a text file, numbers.txt, containing a large (N <= 1000) amount of integers. The integers range in value from 0 to 100. The text file has been created with one value on each line.
The number of integers in the file is unknown.
Your program must find the average of the list of numbers.
Because of the large amount of integers, you will need to declare a total variable as a long integer.
The class name is Average and has one field for the file name.
The constructor should take a file name.
Write a method scanDataAndCalculateAverage() that reads in the numbers from the file and calculates the average of the numbers.
Throw the following exceptions in the scanDataAndCalculateAverage method
File is empty.
File has non-numeric data. You can assume that the data file does not have non-numeric and numeric data mixed in. This is done by checking if something was read in but the count is 0.
Here is a sample output:

Average = 49.91791791791792
squeeze.txt does not have numeric data
empty.txt is empty
Error: notThere.txt (The system cannot find the file specified)
Average = 0.0

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

StopWords:
You will be provided with a text file containing lines of text and a file containing a list of words to be removed. You will write a class which reads in a file of text, perhaps the text of a novel. The class copies the same text to an output file, except that all the useless words such as "the", "a", and "an" are removed. (The words to be removed are given in a file called stopWords.txt.) Read the input text file token by token using hasNext() and next(), but only writing out tokens not on the stop list. The output is written to a file. The filenames will be passed in as parameters to the constructor.
The class has four instance variables
inFile, the input file name,
outFile, the output file name,
maxLineLength, the maximum characters per line, and
stopList, the list of stop words
The constructor initializes the input file name, output file name, stopList and the maxium characters per line to the given values. The String "stopList" is created by reading in all the words given in the file containing the stop words. A method called removeStopWords removes all the stop words from the text and outputs the new text to a file. The method returns the number of words removed from the text.
A method called removeStopWords removes all the stop words from the text and outputs the new text to a file. The method returns the number of words removed from the text.
Here is an example of the original text and the text after the stop words are removed.

Before:
At lunch, Scout rubs Walter's nose in the dirt for getting her in trouble, but Jem intervenes and invites Walter to lunch (in the novel, as in certain regions of the country, the midday meal is called "dinner").

After:
lunch, Scout rubs Walter's nose dirt getting
trouble, but Jem intervenes invites Walter lunch
(in novel, certain regions country, midday meal
called "dinner").
