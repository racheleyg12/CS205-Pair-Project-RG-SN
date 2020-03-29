
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

    }


}