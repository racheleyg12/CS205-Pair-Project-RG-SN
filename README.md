# CS205-Pair-Project-RG-SN
CS 205 Software Engineering Pair Project: Classroom Scheduler  
By: Rachel Goldman and Stanhope Nwosu   

Making a classroom scheduler that will optimally schedule classes --using least amount of classrooms. It will schedule classes in classrooms base on the time of the classes and the availability of classrooms.

## Changes made for better encapsulation & functionailty:  
-From the initial proposal we got rid of Student class (like we agreed upon).  
-We changed all Sets to ArraysLists from the initial submission of the outline.  
-Got rid of addProfessor (Professor p) in Schedule as it didn't make sense since a Professor is not a field in Schedule and if a field in Class, where it already has it's own add method.    
-We changed find methods in Schedule to return a boolean, to return true if class and professor are found, false otherwise.  
-To Classroom we added a new field classes: ```ArrayList<Class>``` as a classroom would contain a schedule of classes. 
-We changed availabiliy to available: boolean, which is true if classes are already scheduled in the classroom and false if not.   
-In Schedule method ArrayList<Class> getClassesInClassroom(Classroom r) essentially has the same functionality as Arraylist<Classroom> getClasssrooms, so it was deleted.   
-To Class we added compareTo method in order to sort (by finish time) and compatible method to see which other classes are not overlapping with it to schedule classes correctly.  
-Added class is SortByClass which implements Comparator, its only function we use is ```int compare(Class a, Class b)``` in
```Collections.sort(classes, new sortByClass());``` to sort the classes in order of finish time.   


## Standards for scheduling classes:    
-Classroom are available 8am to 8pm.      
-Classes are schedule using an integer for the hour (ie. 8am, 9am, 10am, ..., 7pm, 8pm).     
-Classes are schedule to the minute using a decimal (ie. .30 = 30min). (We did NOT want to make the decimal represent a percentage of an hour, or we get weird fractions that would covert well to minutes).     
-Classes are scheduled in military time/24 hour clock (from 8 to 20), but will be printed in 12 hour clock time.  
-Class scheduling example: 8.30 is 8:30, 14:45 is 2:45, 17.15 is 5:15.   
-Not all classrooms may be used, this program is designed to used the fewest classroom for all scheduled classroom (ie. optimizing the amount of classrooms needed to be used).     

## Outline of Classes:  
--------------------Class----------------------   
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
            
-----------------Classroom--------------------  
```
        —————Fields—————  
        building: string  
        room number: string (ie. E204)   
        name: string (building + room number)  
        class capacity: int  
        available: boolean    
        classes: ArrayList<Class>
        —————Methods—————  
        getters, initializer/constructor
        void setClasses(ArrayList<Class> classes)
        void setAvailability(boolean available)
```
  
-----------------Professor--------------------  
```
        —————Fields—————  
        name: string  
        department/subject: string
        office location: string  
        email: string      
        —————Methods—————  
        getters, initializer/constructor  
```
  
---------------Schedule----------------------- 
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
        Arraylist<Professor> getProfessors
        
        //Returns Optimally schedule of all classes & classrooms in the object    
        Arraylist<String> scheduleClasses()  
    
```
