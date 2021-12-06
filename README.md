# cs245-assignment2

My implementation of a suggest function is supposed to contain two Lists, one List to store the suggested words and another to store each prefix of the token word. Additionally there is a List of List that stores all the Lists of all the suggested words.

I have a for loop that is supposed to loop through each character of the token word, and sets the current character as a char ch. Then I would traverse through the Trie, called list, and with each iteration through the token, sort the frequencies from assending order according to the given prefix of the word. Then I would have looped through these frequencies and add sorted words from highest frequency into the suggestions list, and store that in a result variable. 

Part 4:

Something that can be changedi n the implementation is that when iterating through the token, and the next iteration outputs the same results as the last iteration, for example, in the Assignment 2 pdf, the example uses the token "onomatopoeia" and a count of "5". The result is:

{"of", "on", "or", "our", "one"},
{"on", "one", "only", "online", "once"},
{"ona", "onan", "onalaska", "onassis", "onanie"},
{"onomatopoeia", "onoma", "onoml", "onomichi", "onomastics"},
{"onomatopoeia", "onoma", "onoml", "onomichi", "onomastics"},
...
{"onomatopoeia", "onoma", "onoml", "onomichi", "onomastics"}

You can see that the fourth iteration outputs the same results as the third, but will continue to loop until the word "onomatopoeia" has finished looping through each character. So one way to improve on this implementation is to check if the same output will be returned twice, and to break out of the loop when that happens, thus making it more efficient.
