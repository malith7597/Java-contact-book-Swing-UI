# Java-contact-book-Swing-UI
A contact book application using Java swing
General description of the problem 
The address book program contains a ‘database’ of your contacts: names, addresses and other details — the database is quite small in this version, but in principle it could be quite large.  Of course, in this exercise, the ‘database’ will be a little unrealistic: the information is built-in to the program (whereas in a ‘serious’ system it would, perhaps, be read in from a file or held in a proper database).  The database inside the program is a parallel collection of arrays of Strings:  one array for the names, one array for the addresses, and so on.  The strings in the elements at positions with index 0 of each array comprise the information about one contact, the strings in elements at positions with index 1 comprise the information about another contact, and so on.  There is a single variable, currentSize, that holds the number of contact details currently held in the database, and a single variable, currentContact, that holds the index of the currently selected contact (or -1 if there are no contacts).
User interface buttons are provided to allow the user:
•	to navigate forwards and backwards through the entries in the address book
•	to add a new contact
•	to delete the current, or all contacts
•	to search for a contact by exact name match
•	to search for a contact by case insensitive match to any part of a name
•	to re-order the contacts in ascending name order
•	to re-order the contacts in descending name order
The navigation buttons function correctly.
The add new contact button almost functions correctly – it does not detect when the user is attempting to add another contact to a full database.  This is because the method called by the button’s event handler is incomplete.
The other six buttons do not work:  The user interface code for them is fine, but it calls core data processing methods to carry out the necessary accesses/updates to the data in the arrays, and those methods require completing.  The incomplete methods are listed in the table at the foot of page 1.  You will find them in the code below line 445 (see ///////////////////////////).
You should insert your student number in place of 1234567 in line 117.
All other work is on the seven method bodies:  You must complete the addContact method, and implement full method bodies for deleteContact, clearContacts, findContact, findPartial, sortAtoZ and sortZtoA.
Note: You MUST NOT alter any other parts of the program:
•	the GUI parts are complete and correct
•	the array declarations are complete and correct
•	the method headers are complete and correct.
Advice — Incremental Development 
Be very wary of tackling programming using the “Big Bang” approach:  don't try to create the entire final program before entering it and testing out your ideas.  That way lies frustration and poor progress. 
We advise that you develop programs one step at a time – in this assignment perhaps one method at a time.  At each step you can design and enter a little bit more of the final program.  Of course, when you run the program at each step it won't do everything that the final program is supposed to, but you can check that the design so far is functioning correctly.  [Further, if you run out of time doing the assignment, then you can submit your most recent correctly functioning version, confident that it does something properly — a large but non-functioning program is hard to give credit for.]  This is an important technique in developing big programs: we can build a complete, compliable, and runnable program without having designed all the details. 
The incremental development approach is valuable for various reasons:  If you have a working version of the program and you add only a little new code at a time, when something turns out to be faulty then it should be fairly clear where to look for the fault!  (Clearly, if you have just typed in 100 lines of Java and it doesn't work, then locating the fault might be like looking for a needle in the proverbial haystack!)  It is also very reassuring to see some facilities coming “on-line” at an early stage — rather than working to complete the whole program before trying it out!  Good psychology and good methodology.
