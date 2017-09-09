List Experiments
================

A set of quick and dirty methods to benchmark the performance of various List implementations in Java.

Overview
--------
There are 4 methods that perform various functions to alter, add to, or manipulate the lists.

HeadInsert: Creates a List and inserts the given payload the specified number of times at the head of the list, bumping all previous entries down the List.

TailInsert: Creates a List and inserts the given payload the specified number of times at the end of the list

MidpointInsert: Creates a List and inserts the given payload the specified number of times in the middle of the list, 
bumping previous entries down the List as necessary. When calculating the midpoint, round down to the 
nearest integer index. For example, if the list currently contains items at indices 0, 1, and 2, the 
next item should be inserted at index 1.

AlternateInsert: Creates a List and inserts the given payload the specified number of times as if the List 
items were arranged in a circle with new items inserted after every other existing item.

Usage
-----
To run this program, you will need to click on the clone or download button, then copy the URL address. After this step,
you must visit your terminal and paste the URL to initialize your git repository. Once you have downloaded it to your computer, you are ready to run 
the program.

Authors
-------
Nate Hefner and Jenny Fish

License
-------
Copyright (c) 2017 Nate Hefner & Jenny Fish

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
