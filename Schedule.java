/* class Schedule
 * Main part of program will be scheduling classes in classroom
 */
public class Schedule{
    //—————Fields—————
    //      Classes: set <Class>
    set<Class> classes;
    //      Classrooms: set <Classrooms>
    set<Classroom> classroomset;
    //      Professor: set <Professors>
    set<Professor> professors;
    //      Students: set <Students>
    set<Student> students; //is this class/set still needed

    ///methods:
    //  addClass (Class c)
    public void addClass(Class c){
        classes.add(c);
    } //TODO: clean up and checks
    //      list <Class> getClasses //TODO: clean up and checks
    public list<Class> getClasses() {
        return classes;
    }
    //      Class findClass (string name)
    public Class findClass(String name){ //TODO: clean up and checks
        for (Class c : classes) {
            if(c.name == name){ //by name or dept?
                return c;
            } //what if there are multiples
        }
    }
    //      addClassroom (Classroom r) //TODO: clean up and checks
    public void addClassroom(Classroom r){
        classroomset.add(r);
    }
    //      list <Classroom> getClasssrooms //TODO: clean up and checks
    public set<Classroom> getClassroomset() {
        return classroomset;
    }
    //      Classroom findClassroom (string name)
    public Classroom findClassroom(String name){ //TODO: clean up and checks
        for (Classroom cr : classroomset) {
            if(cr.name == name){ // checking by name (building + room)
                return cr;
            } //what if there are multiples
        }
    }
    //      addProfessor (Professor p) ///TODO: clean up and checks
    public void addProfessor(Professor p) {
        professors.add(p);
    }
    //      list <Professor> getProfessors //TODO: clean up and checks
    public set<Professor> getProfessors() {
        return professors;
    }
    //      Professor findProfessor(string name)
    public Professor findProfessor(string name){ //TODO: clean up and checks
        for (Professor p : professors) {
            if(p.name == name){ //what if there are multiple porfessors of same name
                return p;
            }
        }
        // if no professors match, then nothing
    }

    //Schedule classes base on their time & availability of classrooms
    //Optimally schedule classes - using least amount of classrooms
    //Returns Optimally schedule of all classes & classrooms in the object
    public list<string> scheduleClasses(){ //TODO: clean up, checks, implements
        list<string> sched = new list<string>;

        return sched;
    }

    //Gets all classes occurring in classroom
    list<Class> getClassesInClassroom(Classroom r){ //TODO: clean up, checks, implements
        list<Class> inRoom = new list<Class>();

        return inRoom;
    }


}