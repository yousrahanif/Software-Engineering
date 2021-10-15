I have six classes.

User Class:
It has user id and user password. Those are private value so not everyone can access those. 
It allows to add users, edit users and remover users.

ReminderList:
Reminder list has name and Id.
It allows to create, delete, rename, select list. 
Also it allows add reminder in the list, delete reminder, edit reminder, search, save, clear reminder. 
Moreover, it can set time for reminder. 
This class have relation (composition) with Checking Class


Checking class:
The main work it does helping reminder list.
It allows to add check mark to the reminder in reminderlist and also uncheck reminder in that list. 


Reminder:
Reminderlist has a relation (composition) with reminder.
Reminder has a name.
Also some method for set reminder name, find reminder, assign reminder id and mostly location. 
To access reminder based on location it has Google Maps locations.


ReminderType:
ReminderType and Reminder has a compiste relation. 
It also has type and an id.
It allows to add reminder method. 


ReminderFrequency:
ReminderFrequency has composite relation with Reminder.
It gives end date of the reminder.
Also, tell us what is the frequency of that reminder. Such as, if the reminder for a week or daily based reminder.







