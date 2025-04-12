package Main4;

import java.util.NoSuchElementException;

public class StudentManager{
    private String[] students = new String[5];
    private int count = 0;
    
    public void addStudent(String name) throws ArrayIndexOutOfBoundsException{
        if(count >= students.length){
            throw new ArrayIndexOutOfBoundsException("これ以上学生を追加できません。リストがいっぱいです。");
        }
        students[count] = name;
        count++;
    }
    
    public String getStudent(int id) throws ArrayIndexOutOfBoundsException, NullPointerException {
        if(id >= students.length || id < 0){
            throw new ArrayIndexOutOfBoundsException("無効な学生IDです:" + id + "\n学生ID " + id + " : null");
        }

        if(students[id] == null){
            throw new NullPointerException("学生ID " + id + " にデータがありません。" + "\n学生ID " + id + " : " + students[id]);
        }
        return students[id];
    }
    
    public void updateStudent(int id, String name)throws NoSuchElementException {
        if(id < 0 || id >= students.length || students[id] == null){
            throw new NoSuchElementException("無効な学生IDです:" + id);
        }
        students[id] = name;
    }
}
