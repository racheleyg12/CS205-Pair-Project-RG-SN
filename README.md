# CS205-Pair-Project-RG-SN
CS 205 Software Engineering Pair Project: Classroom Scheduler

Making a classroom scheduler that will optimally schedule classes --using least amount of classrooms. It will schedule classes in classrooms base on the time of the classe and the availability of classrooms.

The main program wil run in the Schedule class.

By: Rachel Goldman and Stanhope Nwosu

Outline of Classes:  
Class   
        —————Fields—————  
        department/subject: string  
        name: string  
        professor: Professor  
        class capacity: int  
        prerequisite course(s): set <Class>  
        time: double[] //Start time & end time  
        —————Methods—————  
        getters, initializer/constructor  
Classroom  
        —————Fields—————  
        building: string  
        room number: string (ie. E204)   
        name: string (building + room number)  
        class capacity: int  
        availability: double[]     //An array/list/or vector of time slots
        —————Methods—————
        getters, initializer/constructor
Professor
        —————Fields—————
        name: string
        department/subject: string
        //office location & email
        —————Methods—————
        getters, initializer/constructor
Schedule:
        —————Fields—————
        Classes: set <Class>
        Classrooms: set <Classrooms>
        Professor: set <Professors>
        Students: set <Students>
        —————Methods—————
        addClass (Class c)
        list <Class> getClasses
        Class findClass (string name)        
        addClassroom (Classroom r)
        list <Classroom> getClasssrooms
        Classroom findClassroom (string name)
        addProfessor (Professor p)
        list <Professor> getProfessors
        Professor findProfessor(string name)
        //Returns Optimally schedule of all classes & classrooms in the object
        list<string> scheduleClasses()
        //Gets all classes occurring in classroom
        list<Class> getClassesInClassroom(Classroom r)
