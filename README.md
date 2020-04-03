# CS205-Pair-Project-RG-SN
CS 205 Software Engineering Pair Project: Classroom Scheduler

Making a classroom scheduler that will optimally schedule classes --using least amount of classrooms. It will schedule classes in classrooms base on the time of the classe and the availability of classrooms.

The main program wil run in the Schedule class. 

Some Changes:  
-From the initial proposal we got rid of student class.  
-We changed all sets to arrays from the initial submission of the outline.  
-Got rid of addProfessor (Professor p) in the Schedule class as that should be something done within the Class class, because each class needs a professor.  
-We changed find methods to return a boolean, true if class and professor are found, false otherwise.  
-To Class we added compareTo method in order to sort(by finish time) and compatible method to see which other classes are not overlapping with it.  

Standards:    
-Classroom are available 8am to 8pm   
-Classes are schedule on the hour, (ie. 8am, 9am, 10am, ..., 7pm, 8pm)
-Classes are scheduled in military time/24 hour clock (from 8 to 20), but will be printed in 12 hour clock time.    
-Not all classrooms may be used, this program is designed to used the fewest classroom for all scheduled classroom (ie. optimizing the amount of classrooms needed to be used).  

By: Rachel Goldman and Stanhope Nwosu

Outline of Classes:  
---------------------------------------Class---------------------------------------------   
```
        —————Fields—————  
        department/subject: string  
        name: string  
        professor: Professor  
        class capacity: int  
        prerequisite course(s): Array<Class>  
        time: double[] //Start time & end time  
        —————Methods—————  
        getters, initializer/constructor
        int compareTo(Class c)
        boolean compatible(Class c)
 ```       
            
----------------------------------------Classroom-------------------------------------------  
```
        —————Fields—————  
        building: string  
        room number: string (ie. E204)   
        name: string (building + room number)  
        class capacity: int  
        availability: double[]     //An array/list/or vector of time slots  
        —————Methods—————  
        getters, initializer/constructor  
```
  
-----------------------------------------Professor-------------------------------------------  
```
        —————Fields—————  
        name: string  
        department/subject: string
        office location: string  
        email: string      
        —————Methods—————  
        getters, initializer/constructor  
```
  
------------------------------------------Schedule-------------------------------------------- 
```
        —————Fields—————  
        Classes: set <Class>  
        Classrooms: set <Classrooms>    
        —————Methods—————  
        initializer/constructor
        addClass (Class c)             
        addClassroom (Classroom r)  
        Boolean findClass (string name) 
        Boolean findClassroom (string name)  
        Boolean findProfessor(string name) 
        Arraylist<Class> getClasses 
        Arraylist<Classroom> getClasssrooms
        
        //Returns Optimally schedule of all classes & classrooms in the object    
        Arraylist<string> scheduleClasses()  
        
        //Gets all classes occurring in classroom  
        Arraylist<Class> getClassesInClassroom(Classroom r)  
```
