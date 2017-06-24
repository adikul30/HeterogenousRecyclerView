package demo.test.heterogenousrecyclerview;

/**
 * Created by adicool on 24/6/17.
 */

public class LecturesModel {
    String subject,teacher,time,room;

    public LecturesModel(String subject, String teacher, String time, String room) {
        this.subject = subject;
        this.teacher = teacher;
        this.time = time;
        this.room = room;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
