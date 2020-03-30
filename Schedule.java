
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
    }
    //      list <Class> getClasses
    public list<Class> getClasses() {
        return classes;
    }
    //      Class findClass (string name)
    public Class findClass(String name){
        for (Class c : classes) {
            if(c.name == name){ //by name or dept?
                return c;
            } //what if there are multiples
        }
    }
    //      addClassroom (Classroom r)
    public void addClassroom(Classroom r){
        classroomset.add(r);
    }
    //      list <Classroom> getClasssrooms
    public set<Classroom> getClassroomset() {
        return classroomset;
    }
    //      Classroom findClassroom (string name)
    public Classroom findClassroom(String name){
        for (Classroom cr : classroomset) {
            if(cr.name == name){ // checking by name (building + room)
                return cr;
            } //what if there are multiples
        }
    }
    //      addProfessor (Professor p)
    public void addProfessor(Professor p) {
        professors.add(p);
    }
    //      list <Professor> getProfessors
    public set<Professor> getProfessors() {
        return professors;
    }
    //      Professor findProfessor(string name)
    public Professor findProfessor(string name){
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
    public list<string> scheduleClasses(){
        list<string> sched = new list<string>;

        return sched;
    }

    //Gets all classes occurring in classroom
    list<Class> getClassesInClassroom(Classroom r){
        list<Class> inRoom = new list<Class>();

        return inRoom;
    }


}